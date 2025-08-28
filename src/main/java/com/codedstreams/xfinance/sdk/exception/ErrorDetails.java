package com.codedstreams.xfinance.sdk.exception;


/**
 * Detailed error information for API error responses.
 *
 * @author X-Finance-Util Team
 * @version 1.0.0
 * @since 1.0.0
 */
public class ErrorDetails {
    private String code;
    private String message;
    private String field;
    private String details;

    /**
     * Default constructor.
     */
    public ErrorDetails() {
    }

    /**
     * Constructs a new ErrorDetails with the specified parameters.
     *
     * @param code the error code
     * @param message the error message
     * @param field the field that caused the error
     * @param details additional error details
     */
    public ErrorDetails(String code, String message, String field, String details) {
        this.code = code;
        this.message = message;
        this.field = field;
        this.details = details;
    }

    /**
     * Gets the error code.
     *
     * @return the error code
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the error code.
     *
     * @param code the error code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Gets the error message.
     *
     * @return the error message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the error message.
     *
     * @param message the error message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Gets the field that caused the error.
     *
     * @return the field name
     */
    public String getField() {
        return field;
    }

    /**
     * Sets the field that caused the error.
     *
     * @param field the field name to set
     */
    public void setField(String field) {
        this.field = field;
    }

    /**
     * Gets additional error details.
     *
     * @return the error details
     */
    public String getDetails() {
        return details;
    }

    /**
     * Sets additional error details.
     *
     * @param details the details to set
     */
    public void setDetails(String details) {
        this.details = details;
    }
}
