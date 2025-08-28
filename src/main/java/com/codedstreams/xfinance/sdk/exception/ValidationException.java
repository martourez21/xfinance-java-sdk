package com.codedstreams.xfinance.sdk.exception;

/**
 * Exception thrown when input validation fails.
 *
 * @author X-Finance-Util Team
 * @version 1.0.0
 * @since 1.0.0
 */
public class ValidationException extends XFinanceException {

    /**
     * Constructs a new ValidationException with the specified detail message and cause.
     *
     * @param message the detail message
     */
    public ValidationException(String message) {
        super(message);
    }
}