package com.codedstreams.xfinance.sdk.exception;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Generic API response wrapper for all API responses.
 *
 * @param <T> the type of data contained in the response
 * @author X-Finance-Util Team
 * @version 1.0.0
 * @since 1.0.0
 */
public class ApiResponse<T> {
    private boolean success;
    private String message;
    private T data;
    private LocalDateTime timestamp;
    private String requestId;

    /**
     * Default constructor.
     */
    public ApiResponse() {
    }

    /**
     * Constructs a new ApiResponse with the specified parameters.
     *
     * @param success whether the request was successful
     * @param message the response message
     * @param data the response data
     * @param timestamp the response timestamp
     * @param requestId the request identifier
     */
    public ApiResponse(boolean success, String message, T data, LocalDateTime timestamp, String requestId) {
        this.success = success;
        this.message = message;
        this.data = data;
        this.timestamp = timestamp;
        this.requestId = requestId;
    }

    /**
     * Checks if the request was successful.
     *
     * @return true if successful, false otherwise
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * Sets the success status.
     *
     * @param success the success status to set
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }

    /**
     * Gets the response message.
     *
     * @return the response message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the response message.
     *
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Gets the response data.
     *
     * @return the response data
     */
    public T getData() {
        return data;
    }

    /**
     * Sets the response data.
     *
     * @param data the data to set
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * Gets the response timestamp.
     *
     * @return the timestamp
     */
    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the response timestamp.
     *
     * @param timestamp the timestamp to set
     */
    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Gets the request identifier.
     *
     * @return the request ID
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the request identifier.
     *
     * @param requestId the request ID to set
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
}