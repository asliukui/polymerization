package com.polymerization.core.retrofit.Exception;

/**
 * Author: yangweichao
 * Date:   2018/11/23 4:10 PM
 * Description: 异常处理
 */


public class ServiceException extends Exception {
    private int code;
    private String displayMessage;

    public ServiceException(int code, String displayMessage) {
        this.code = code;
        this.displayMessage = displayMessage;
    }

    public ServiceException(int code, String message, String displayMessage) {
        super(message);
        this.code = code;
        this.displayMessage = displayMessage;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDisplayMessage() {
        return displayMessage;
    }

    public void setDisplayMessage(String displayMessage) {
        this.displayMessage = displayMessage;
    }


}
