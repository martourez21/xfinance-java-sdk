package com.codedstreams.xfinance.sdk.exception;

/**
 * Exception thrown when authentication fails.
 *
 * @author X-Finance-Util Team
 * @version 1.0.0
 * @since 1.0.0
 */
public class AuthenticationException extends XFinanceException {
    /**
     * Constructs a new AuthenticationException with the specified detail message.
     *
     * @param message the detail message
     */
    public AuthenticationException(String message) {
        super(message, 401, "AUTHENTICATION_FAILED");
    }

    /**
     * Constructs a new AuthenticationException with the specified detail message and cause.
     *
     * @param message the detail message
     * @param cause the cause of the exception
     */
    public AuthenticationException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Exception thrown when network operations fail.
     *
     * @author X-Finance-Util Team
     * @version 1.0.0
     * @since 1.0.0
     */
    public static class NetworkException extends XFinanceException {

        /**
         * Constructs a new NetworkException with the specified detail message and cause.
         *
         * @param message the detail message
         */
        public NetworkException(String message) {
            super(message);
        }
    }
}
