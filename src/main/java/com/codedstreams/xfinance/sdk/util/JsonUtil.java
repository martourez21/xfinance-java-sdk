package com.codedstreams.xfinance.sdk.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.lang.reflect.Type;

/**
 * Utility class for JSON serialization and deserialization.
 *
 * @author X-Finance-Util Team
 * @version 1.0.0
 * @since 1.0.0
 */
public class JsonUtil {
    private static final ObjectMapper objectMapper = createObjectMapper();

    private static ObjectMapper createObjectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        return mapper;
    }

    /**
     * Converts an object to JSON string.
     *
     * @param object the object to convert
     * @return the JSON string representation
     * @throws RuntimeException if conversion fails
     */
    public static String toJson(Object object) {
        try {
            return objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Failed to convert object to JSON", e);
        }
    }

    /**
     * Converts a JSON string to an object of the specified type.
     *
     * @param <T> the type of the object
     * @param json the JSON string
     * @param clazz the class of the object
     * @return the deserialized object
     * @throws RuntimeException if conversion fails
     */
    public static <T> T fromJson(String json, Class<T> clazz) {
        try {
            return objectMapper.readValue(json, clazz);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Failed to convert JSON to object", e);
        }
    }

    /**
     * Converts a JSON string to an object of the specified type reference.
     *
     * @param <T> the type of the object
     * @param json the JSON string
     * @param typeReference the type reference
     * @return the deserialized object
     * @throws RuntimeException if conversion fails
     */
    public static <T> T fromJson(String json, TypeReference<T> typeReference) {
        try {
            return objectMapper.readValue(json, typeReference);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Failed to convert JSON to object", e);
        }
    }

    /**
     * Gets a parameterized type for generic class deserialization.
     *
     * @param <T> the base type
     * @param <P> the parameter type
     * @param rawClass the raw class
     * @param parameterClass the parameter class
     * @return the type reference
     */
    public static <T, P> TypeReference<T> getParameterizedType(Class<T> rawClass, Class<P> parameterClass) {
        return new TypeReference<T>() {
            @Override
            public Type getType() {
                return objectMapper.getTypeFactory().constructParametricType(rawClass, parameterClass);
            }
        };
    }

    /**
     * Gets the underlying ObjectMapper instance.
     *
     * @return the ObjectMapper instance
     */
    public static ObjectMapper getObjectMapper() {
        return objectMapper;
    }
}
