package com.codedstreams.xfinance.sdk.service;

/**
 * Authentication service for handling API credentials.
 *
 * @author X-Finance-Util Team
 * @version 1.0.0
 * @since 1.0.0
 */
public class AuthenticationService {
    private final String apiKey;
    private final String apiSecret;

    /**
     * Constructs a new AuthenticationService with the specified credentials.
     *
     * @param apiKey the API key
     * @param apiSecret the API secret
     */
    public AuthenticationService(String apiKey, String apiSecret) {
        this.apiKey = apiKey;
        this.apiSecret = apiSecret;
    }

    /**
     * Gets the API key.
     *
     * @return the API key
     */
    public String getApiKey() {
        return apiKey;
    }

    /**
     * Gets the API secret.
     *
     * @return the API secret
     */
    public String getApiSecret() {
        return apiSecret;
    }

    /**
     * Validates the API credentials.
     *
     * @return true if credentials are valid, false otherwise
     */
    public boolean validateCredentials() {
        return apiKey != null && !apiKey.trim().isEmpty() &&
                apiSecret != null && !apiSecret.trim().isEmpty();
    }
}
