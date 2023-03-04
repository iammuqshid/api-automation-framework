package data;

import lombok.ToString;

@ToString
public enum RequestMethods {
    POST("POST"),
    GET("GET"),
    PUT("PUT"),
    DELETE("DELETE"),
    PATCH("PATCH");

    private final String requestMethod;

    RequestMethods(String errorMessage) {
        this.requestMethod = errorMessage;
    }

    public String getRequestMethod() {
        return requestMethod;
    }

}
