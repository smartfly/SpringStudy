package com.smartfly.study.springboot.constant;

import com.smartfly.study.springboot.result.ErrorInfoInterface;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: hutao01
 * Date: 2018/2/6
 * Time: 14:37
 * Description: 业务错误码 案例
 * To change this template use File | Settings | File Templates | Includes | File Header
 */
public enum CityErrorInfoEnum implements ErrorInfoInterface{

    PARAMS_NO_COMPLETE("000001", "params no complete"),
    CITY_EXIT("000002", "city exit");

    private String code;

    private String message;

    CityErrorInfoEnum(String code, String message){
        this.code = code;
        this.message = message;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
