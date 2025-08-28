package com.codedstreams.xfinance.sdk.model.common;

/**
 * Constants used throughout the X-Finance-Util SDK.
 *
 * @author X-Finance-Util Team
 * @version 1.0.0
 * @since 1.0.0
 */
public class Constants {
    /**
     * User agent string for API requests.
     */
    public static final String USER_AGENT = "X-Finance-Java-SDK/1.0.0";

    /**
     * Default API base URL.
     */
    public static final String DEFAULT_BASE_URL = "https://api.xfinanceutil.com";

    /**
     * Default API version.
     */
    public static final String DEFAULT_API_VERSION = "v1";

    /**
     * Default connection timeout in milliseconds.
     */
    public static final int DEFAULT_CONNECT_TIMEOUT = 10000;

    /**
     * Default read timeout in milliseconds.
     */
    public static final int DEFAULT_READ_TIMEOUT = 30000;

    /**
     * Default maximum number of retries.
     */
    public static final int DEFAULT_MAX_RETRIES = 3;

    private Constants() {
        // Utility class - prevent instantiation
    }
}
