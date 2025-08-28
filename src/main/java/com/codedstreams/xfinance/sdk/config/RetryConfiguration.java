package com.codedstreams.xfinance.sdk.config;

/**
 * Configuration class for retry behavior in the X-Finance-Util client.
 *
 * @author X-Finance-Util Team
 * @version 1.0.0
 * @since 1.0.0
 */
public class RetryConfiguration {
    private int maxRetries = 3;
    private long initialBackoffMs = 1000; // 1 second
    private long maxBackoffMs = 10000; // 10 seconds
    private double backoffMultiplier = 2.0;
    private boolean exponentialBackoff = true;

    /**
     * Gets the maximum number of retry attempts.
     *
     * @return the maximum retries
     */
    public int getMaxRetries() {
        return maxRetries;
    }

    /**
     * Sets the maximum number of retry attempts.
     *
     * @param maxRetries the maximum retries to set
     * @return this configuration instance for method chaining
     */
    public RetryConfiguration setMaxRetries(int maxRetries) {
        this.maxRetries = maxRetries;
        return this;
    }

    /**
     * Gets the initial backoff time in milliseconds.
     *
     * @return the initial backoff time
     */
    public long getInitialBackoffMs() {
        return initialBackoffMs;
    }

    /**
     * Sets the initial backoff time in milliseconds.
     *
     * @param initialBackoffMs the initial backoff time to set
     * @return this configuration instance for method chaining
     */
    public RetryConfiguration setInitialBackoffMs(long initialBackoffMs) {
        this.initialBackoffMs = initialBackoffMs;
        return this;
    }

    /**
     * Gets the maximum backoff time in milliseconds.
     *
     * @return the maximum backoff time
     */
    public long getMaxBackoffMs() {
        return maxBackoffMs;
    }

    /**
     * Sets the maximum backoff time in milliseconds.
     *
     * @param maxBackoffMs the maximum backoff time to set
     * @return this configuration instance for method chaining
     */
    public RetryConfiguration setMaxBackoffMs(long maxBackoffMs) {
        this.maxBackoffMs = maxBackoffMs;
        return this;
    }

    /**
     * Gets the backoff multiplier.
     *
     * @return the backoff multiplier
     */
    public double getBackoffMultiplier() {
        return backoffMultiplier;
    }

    /**
     * Sets the backoff multiplier.
     *
     * @param backoffMultiplier the backoff multiplier to set
     * @return this configuration instance for method chaining
     */
    public RetryConfiguration setBackoffMultiplier(double backoffMultiplier) {
        this.backoffMultiplier = backoffMultiplier;
        return this;
    }

    /**
     * Checks if exponential backoff is enabled.
     *
     * @return true if exponential backoff is enabled, false otherwise
     */
    public boolean isExponentialBackoff() {
        return exponentialBackoff;
    }

    /**
     * Enables or disables exponential backoff.
     *
     * @param exponentialBackoff true to enable exponential backoff, false to disable
     * @return this configuration instance for method chaining
     */
    public RetryConfiguration setExponentialBackoff(boolean exponentialBackoff) {
        this.exponentialBackoff = exponentialBackoff;
        return this;
    }
}
