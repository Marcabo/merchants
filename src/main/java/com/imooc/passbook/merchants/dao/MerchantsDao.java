package com.imooc.passbook.merchants.dao;

import com.imooc.passbook.merchants.entity.Merchants;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description Merchants Dao 接口
 * @auther wubo25320
 * @create 2020-07-22 21:28
 */
public interface MerchantsDao extends JpaRepository<Merchants, Integer> {

    /**
     * 根据 id 获取商户对象
     * @param id
     * @return {@link Merchants}
     */
    Merchants findById(Integer id);

    /**
     * 根据商户名称获取商户对象
     * @param name
     * @return {@link Merchants}
     */
    Merchants findByName(String name);
}
