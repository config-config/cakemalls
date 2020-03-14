package cn.losemen.cakemall.utils;

/**
 * 封装一个请求的通用对象
 * @author hz
 * @version 1.0
 * @Function
 * @date 2020/2/12 - 15:20
 */
public class ActionRequest {
    private int statusCode;//响应状态码
    private String message;//响应的短消息
    private Object data;//响应携带的对象

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
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

    @Override
    public String toString() {
        return "ActionRequest{" +
                "statusCode=" + statusCode +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    public ActionRequest() {
    }

    public ActionRequest(int statusCode, String message, Object data) {
        this.statusCode = statusCode;
        this.message = message;
        this.data = data;
    }
}
