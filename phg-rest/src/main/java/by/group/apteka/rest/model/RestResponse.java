package by.group.apteka.rest.model;

import java.io.Serializable;

/**
 * Date: Mar 13, 2016
 */
public class RestResponse implements Serializable {

    private String status;
    private String message;
    private Object data;

    public RestResponse(String status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
