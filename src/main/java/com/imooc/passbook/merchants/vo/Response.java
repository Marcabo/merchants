package com.imooc.passbook.merchants.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 通用的相应对象
 */
@Data
public class Response {
    /** 错误码,正确返回 0 */
    private Integer errorCode = 0;

    /** 错误码,正确返回空字符串 */
    private String errorMsg = "";

    /** 返回值对象 */
    private Object data;

    /**
     * 正确的相应构造参数
     * @param data 返回值对象
     */
    public Response(Object data) {
        this.data = data;
    }

    public Response() {
    }

    public Response(Integer errorCode, String errorMsg, Object data) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.data = data;
    }
}
