package gov.tn.dhs.opa.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ServiceError {

    @JsonProperty("code")
    private String code;

    @JsonProperty("message")
    private String message;

    public ServiceError(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
