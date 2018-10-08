package pro.darkgod.springbooterrorhandling.error;

import java.util.UUID;

import org.springframework.http.HttpStatus;

public class ErrorResponse {

    private HttpStatus status;
    private int code;
    private String[] errors;
    private long date = System.currentTimeMillis();
    private String uniqueCode = UUID.randomUUID().toString();

    ErrorResponse(HttpStatus status) {
        this.status = status;
        this.code = status.value();
    }

    ErrorResponse(HttpStatus status, String[] errors) {
        this.status = status;
        this.errors = errors;
        this.code = status.value();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public String[] getErrors() {
        return errors;
    }

    public void setErrors(String[] errors) {
        this.errors = errors;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getUniqueCode() {
        return uniqueCode;
    }

    public void setUniqueCode(String uniqueCode) {
        this.uniqueCode = uniqueCode;
    }
}