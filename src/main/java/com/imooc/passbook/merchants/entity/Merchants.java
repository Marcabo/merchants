package com.imooc.passbook.merchants.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @Description 商户对象模型
 * @auther wubo25320
 * @create 2020-07-22 21:17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "merchants")
public class Merchants {
    /** 商户 id, 主键
     * id 标识主键
     * generatedValue 标识 自增长
     * column 标识列属性
     *  */
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = true)
    private Integer id;

    /**
     * 商户名称, 需要时全局唯一的
     * basic 默认都会加上,就算不写也会加上.相对应的是 Transient 表示这个字段不属于这个表
     */
    @Basic
    @Column(name = "name", unique = true, nullable = false)
    private String name;

    /**
     * 商户logo
     */
    @Basic
    @Column(name = "logo_url", nullable = false)
    private String logoUrl;

    /**
     * 商户营业执照
     */
    @Basic
    @Column(name = "business_license_url", nullable = false)
    private String businessLicenseUrl;

    /**
     * 商户联系电话
     */
    @Basic
    @Column(name = "phone", nullable = false)
    private String phone;

    /**
     * 商户地址
     */
    @Basic
    @Column(name = "address", nullable = false)
    private String address;

    /**
     * 商户是否通过审核的标志位
     */
    @Basic
    @Column(name = "is_audit", nullable = false)
    private Boolean isAudit = false;
}
