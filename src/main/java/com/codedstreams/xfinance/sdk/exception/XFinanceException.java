package com.codedstreams.xfinance.sdk.exception;

/**
 * Base exception class for all X-Finance SDK exceptions.
 *
 * This exception is thrown when any error occurs during API communication
 * or data processing within the SDK.
 *
 * @author X-Finance Team
 * @version 1.0.0
 * @since 1.0.0
 */
public class XFinanceException extends Exception {

    private final String errorCode;
    private final Integer httpStatusCode;

    /**
     * Creates a new XFinanceException with a message.
     *
     * @param message The error message
     */
    public XFinanceException(String message) {
        super(message);
        this.errorCode = null;
        this.httpStatusCode = null;
    }

    /**
     * Creates a new XFinanceException with a message and cause.
     *
     * @param message The error message
     * @param cause   The underlying cause
     */
    public XFinanceException(String message, Throwable cause) {
        super(message, cause);
        this.errorCode = null;
        this.httpStatusCode = null;
    }

    /**
     * Creates a new XFinanceException with detailed error information.
     *
     * @param message        The error message
     * @param httpStatusCode The HTTP status code (if applicable)
     * @param errorCode      The specific error code
     */
    public XFinanceException(String message, Integer httpStatusCode, String errorCode) {
        super(message);
        this.httpStatusCode = httpStatusCode;
        this.errorCode = errorCode;
    }

    /**
     * Creates a new XFinanceException with detailed error information and cause.
     *
     * @param message        The error message
     * @param httpStatusCode The HTTP status code (if applicable)
     * @param errorCode      The specific error code
     * @param cause          The underlying cause
     */
    public XFinanceException(String message, Integer httpStatusCode, String errorCode, Throwable cause) {
        super(message, cause);
        this.httpStatusCode = httpStatusCode;
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public Integer getHttpStatusCode() {
        return httpStatusCode;
    }
}
