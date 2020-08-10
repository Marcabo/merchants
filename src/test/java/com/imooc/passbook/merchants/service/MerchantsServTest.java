package com.imooc.passbook.merchants.service;

import com.alibaba.fastjson.JSON;
import com.imooc.passbook.merchants.MerchantsApplication;
import com.imooc.passbook.merchants.vo.CreateMerchantsRequest;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 商户服务测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class MerchantsServTest {

    @Autowired
    private IMerchantsServ iMerchantsServ;


    public void testCreateMerchants() {
        CreateMerchantsRequest request = new CreateMerchantsRequest();
        request.setName("慕课");
        request.setLogoUrl("www.imooc.com");
        request.setBusinessLicenseUrl("www.imooc.com");
        request.setPhone("1243423423");
        request.setAddress("北京市");

        System.out.println(JSON.toJSONString(iMerchantsServ.createMerchants(request)));
    }
}
