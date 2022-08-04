package com.flamesunrises.springbootbasic.common;

/**
 * 常用API返回對象接口
 * 
 * @author jay
 * @since 2022/08/04
 */
public interface IErrorCode {
    /**
     * 返回码
     * 
     * @return code
     */
    long getCode();

    /**
     * 返回信息
     * 
     * @return message
     */
    String getMessage();
}
