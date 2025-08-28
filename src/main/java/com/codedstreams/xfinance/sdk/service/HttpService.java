package com.codedstreams.xfinance.sdk.service;

import com.codedstreams.xfinance.sdk.config.ClientConfiguration;
import com.codedstreams.xfinance.sdk.exception.ApiResponse;
import com.codedstreams.xfinance.sdk.exception.AuthenticationException;
import com.codedstreams.xfinance.sdk.exception.XFinanceException;
import com.codedstreams.xfinance.sdk.model.common.Constants;
import com.codedstreams.xfinance.sdk.util.JsonUtil;
import okhttp3.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * HTTP service for making API requests to X-Finance-Util.
 * Handles authentication, request building, and response parsing.
 *
 * @author X-Finance-Util Team
 * @version 1.0.0
 * @since 1.0.0
 */
public class HttpService {
    private final AuthenticationService authService;
    private final ClientConfiguration config;
    private final OkHttpClient httpClient;

    /**
     * Constructs a new HttpService with the specified authentication service and configuration.
     *
     * @param authService the authentication service
     * @param config the client configuration
     */
    public HttpService(AuthenticationService authService, ClientConfiguration config) {
        this.authService = authService;
        this.config = config;

        OkHttpClient.Builder clientBuilder = new OkHttpClient.Builder()
                .connectTimeout(config.getConnectTimeout(), TimeUnit.MILLISECONDS)
                .readTimeout(config.getReadTimeout(), TimeUnit.MILLISECONDS);

        this.httpClient = clientBuilder.build();
    }

    /**
     * Makes a POST request to the specified endpoint with the given request body.
     *
     * @param <T> the type of the request body
     * @param <R> the type of the response
     * @param endpoint the API endpoint
     * @param request the request body
     * @param responseType the class of the response type
     * @return the parsed response
     * @throws XFinanceException if the request fails
     */
    public <T, R> R post(String endpoint, T request, Class<R> responseType) throws XFinanceException {
        String url = buildUrl(endpoint);
        String requestBody = JsonUtil.toJson(request);

        Request httpRequest = buildRequest(url, requestBody);
        return executeRequest(httpRequest, responseType);
    }

    /**
     * Makes a GET request to the specified endpoint.
     *
     * @param <R> the type of the response
     * @param endpoint the API endpoint
     * @param responseType the class of the response type
     * @return the parsed response
     * @throws XFinanceException if the request fails
     */
    public <R> R get(String endpoint, Class<R> responseType) throws XFinanceException {
        String url = buildUrl(endpoint);

        Request httpRequest = buildRequest(url, null);
        return executeRequest(httpRequest, responseType);
    }

    private String buildUrl(String endpoint) {
        return config.getBaseUrl() +  endpoint;
    }

    private Request buildRequest(String url, String requestBody) {
        Request.Builder requestBuilder = new Request.Builder()
                .url(url)
                .addHeader("X-API-Key", authService.getApiKey())
                .addHeader("X-API-Secret", authService.getApiSecret())
                .addHeader("User-Agent", Constants.USER_AGENT);

        if (requestBody != null) {
            RequestBody body = RequestBody.create(
                    requestBody,
                    MediaType.parse("application/json; charset=utf-8")
            );
            requestBuilder.post(body);
        } else {
            requestBuilder.get();
        }

        return requestBuilder.build();
    }

    private <R> R executeRequest(Request request, Class<R> responseType) throws XFinanceException {
        try (Response response = httpClient.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                handleErrorResponse(response);
            }

            String responseBody = response.body().string();
            ApiResponse<R> apiResponse = JsonUtil.fromJson(responseBody,
                    JsonUtil.getParameterizedType(ApiResponse.class, responseType));

            if (!apiResponse.isSuccess()) {
                throw new XFinanceException(apiResponse.getMessage());
            }

            return apiResponse.getData();
        } catch (IOException e) {
            throw new AuthenticationException.NetworkException("Network error occurred: " + e.getMessage());
        }
    }

    private void handleErrorResponse(Response response) throws XFinanceException {
        int statusCode = response.code();
        String message = "HTTP error: " + statusCode;

        try {
            String responseBody = response.body().string();
            ApiResponse<?> errorResponse = JsonUtil.fromJson(responseBody, ApiResponse.class);
            message = errorResponse.getMessage();
        } catch (Exception e) {
            // Use default message if response parsing fails
        }

        if (statusCode == 401 || statusCode == 403) {
            throw new AuthenticationException(message);
        } else if (statusCode >= 500) {
            throw new AuthenticationException.NetworkException(message);
        } else {
            throw new XFinanceException(message, statusCode, "HTTP_ERROR");
        }
    }

    /**
     * Gets the underlying HTTP client.
     *
     * @return the HTTP client
     */
    public OkHttpClient getHttpClient() {
        return httpClient;
    }
}
