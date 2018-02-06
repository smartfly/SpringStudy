package com.smartfly.study.springboot.result;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: hutao01
 * Date: 2018/2/6
 * Time: 15:14
 * Description: 统一错误码异常
 * To change this template use File | Settings | File Templates | Includes | File Header
 */
public class GlobalErrorInfoException extends Exception{

    private ErrorInfoInterface errorInfo;

    public GlobalErrorInfoException(ErrorInfoInterface errorInfo){
        this.errorInfo = errorInfo;
    }

    public ErrorInfoInterface getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(ErrorInfoInterface errorInfo) {
        this.errorInfo = errorInfo;
    }
}
