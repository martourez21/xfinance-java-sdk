package com.codedstreams.xfinance.sdk.config;

/**
 * Configuration class for the X-Finance-Util client.
 * Allows customization of client behavior and connection settings.
 *
 * @author X-Finance-Util Team
 * @version 1.0.0
 * @since 1.0.0
 */
public class ClientConfiguration {
    private String baseUrl = "http://localhost:8087/api/v1";
    private String apiVersion = "v1";
    private int connectTimeout = 10000; // 10 seconds
    private int readTimeout = 30000; // 30 seconds
    private int maxRetries = 3;
    private boolean enableLogging = false;

    /**
     * Gets the base URL for API requests.
     *
     * @return the base URL
     */
    public String getBaseUrl() {
        return baseUrl;
    }

    /**
     * Sets the base URL for API requests.
     *
     * @param baseUrl the base URL to set
     * @return this configuration instance for method chaining
     */
    public ClientConfiguration setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        return this;
    }

    /**
     * Gets the API version.
     *
     * @return the API version
     */
    public String getApiVersion() {
        return apiVersion;
    }

    /**
     * Sets the API version.
     *
     * @param apiVersion the API version to set
     * @return this configuration instance for method chaining
     */
    public ClientConfiguration setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * Gets the connection timeout in milliseconds.
     *
     * @return the connection timeout
     */
    public int getConnectTimeout() {
        return connectTimeout;
    }

    /**
     * Sets the connection timeout in milliseconds.
     *
     * @param connectTimeout the connection timeout to set
     * @return this configuration instance for method chaining
     */
    public ClientConfiguration setConnectTimeout(int connectTimeout) {
        this.connectTimeout = connectTimeout;
        return this;
    }

    /**
     * Gets the read timeout in milliseconds.
     *
     * @return the read timeout
     */
    public int getReadTimeout() {
        return readTimeout;
    }

    /**
     * Sets the read timeout in milliseconds.
     *
     * @param readTimeout the read timeout to set
     * @return this configuration instance for method chaining
     */
    public ClientConfiguration setReadTimeout(int readTimeout) {
        this.readTimeout = readTimeout;
        return this;
    }

    /**
     * Gets the maximum number of retries for failed requests.
     *
     * @return the maximum retries
     */
    public int getMaxRetries() {
        return maxRetries;
    }

    /**
     * Sets the maximum number of retries for failed requests.
     *
     * @param maxRetries the maximum retries to set
     * @return this configuration instance for method chaining
     */
    public ClientConfiguration setMaxRetries(int maxRetries) {
        this.maxRetries = maxRetries;
        return this;
    }

    /**
     * Checks if logging is enabled.
     *
     * @return true if logging is enabled, false otherwise
     */
    public boolean isEnableLogging() {
        return enableLogging;
    }

    /**
     * Enables or disables logging.
     *
     * @param enableLogging true to enable logging, false to disable
     * @return this configuration instance for method chaining
     */
    public ClientConfiguration setEnableLogging(boolean enableLogging) {
        this.enableLogging = enableLogging;
        return this;
    }
}