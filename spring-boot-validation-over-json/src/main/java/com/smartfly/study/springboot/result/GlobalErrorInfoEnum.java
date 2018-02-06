package com.smartfly.study.springboot.result;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: hutao01
 * Date: 2018/2/6
 * Time: 15:11
 * Description: 应用系统级别的错误码
 * To change this template use File | Settings | File Templates | Includes | File Header
 */
public enum GlobalErrorInfoEnum implements ErrorInfoInterface{
    SUCCESS("0", "success"),
    NOT_FOUND("-1", "service not found");

    private String code;

    private String message;

    GlobalErrorInfoEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
