package com.imooc.passbook.merchants.service;

import com.imooc.passbook.merchants.vo.CreateMerchantsRequest;
import com.imooc.passbook.merchants.vo.PassTemplate;
import com.imooc.passbook.merchants.vo.Response;

/**
 * 对商户服务接口定义
 */
public interface IMerchantsServ {

    /**
     * 创建商户服务
     * @param request {@link CreateMerchantsRequest} 创建商户请求
     * @return {@link Response}
     */
    Response createMerchants(CreateMerchantsRequest request);

    /**
     * 根据 id 构造商户信息
     * @param id {@link Integer} 商户 id
     * @return
     */
    Response buildMerchantsInfoById(Integer id);

    /**
     * 投放优惠卷
     * @param template {@link PassTemplate} 优惠卷对象
     * @return {@link Response}
     */
    Response dropPassTemplate(PassTemplate template);
}
