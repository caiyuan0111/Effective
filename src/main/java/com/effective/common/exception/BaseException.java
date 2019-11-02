package com.effective.common.exception;

/**
 * @Description
 * @author:caiyuan
 * @date:2019/10/25 0025
 * @ver:1.0
 **/
public class BaseException extends RuntimeException {

    public BaseException() {
        super();
    }
    public BaseException(String message) {
        super(message);
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseException(Throwable cause) {
        super(cause);
    }

    public BaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
