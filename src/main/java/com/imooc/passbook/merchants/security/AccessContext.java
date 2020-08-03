package com.imooc.passbook.merchants.security;

/**
 * @Description 用 ThreadLocal 去单独存储每一个线程携带的 Token 信息
 * @auther wubo25320
 * @create 2020-07-22 21:06
 */
public class AccessContext {
    public static final ThreadLocal<String> token = new ThreadLocal<>();

    public static String getToken() {
        return token.get();
    }

    public static void setToken(String tokenStr) {
        token.set(tokenStr);
    }

    public static void clearAccessKey() {
        token.remove();
    }
}
