package com.imooc.passbook.merchants.security;

import com.imooc.passbook.merchants.constant.Constants;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description 权限拦截器, 此拦截器拦截所有HTTP请求
 * @auther wubo25320
 * @create 2020-07-22 21:09
 */
@Component
public class AuthCheckInterceptor implements HandlerInterceptor {

    /**
     * 在真正http请求前,执行此方法
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        String token = httpServletRequest.getHeader(Constants.TOKEN_STRING);
        if (StringUtils.isEmpty(token)) {
            throw new Exception("Header 中缺少 " + Constants.TOKEN_STRING + "!");
        }
        if (!Constants.TOKEN.equals(token)) {
            throw new Exception("Header 中 " + Constants.TOKEN_STRING + " 错误!");
        }
        AccessContext.setToken(token);
        return true;
    }

    /**
     * 在执行完http请求后,执行此方法
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    /**
     * 确定http请求完成后,才会执行此方法.(如抛出异常就不会执行 postHandle而执行此方法)
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @param e
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        AccessContext.clearAccessKey();
    }
}
