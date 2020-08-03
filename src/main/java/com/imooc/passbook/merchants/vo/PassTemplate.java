package com.imooc.passbook.merchants.vo;

import com.imooc.passbook.merchants.constant.ErrorCode;
import com.imooc.passbook.merchants.dao.MerchantsDao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 投放的优惠卷对象定义
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PassTemplate {
    /** 所属商户 id */
    private Integer id;

    /** 优惠卷标题 */
    private String title;

    /** 优惠卷摘要 */
    private String summary;

    /** 优惠卷详细信息 */
    private String desc;

    /** 最大个数限制 */
    private Long limit;

    /** 优惠卷是否有token, 用于商户核销 */
    private Boolean hasToken;  // token 存储于Redis Set 中, 每次领取从Redis中获取

    /** 优惠卷背景色 */
    private Integer background;

    /**  优惠卷结束时间 */
    private Date start;

    /** 优惠卷结束时间 */
    private Date end;

    /**
     * 校验优惠卷对象的有效性
     * @param merchantsDao {@link MerchantsDao}
     * @return {@link ErrorCode}
     */
    public ErrorCode validate(MerchantsDao merchantsDao) {
        if (null == merchantsDao.findById(id)) {
            return ErrorCode.MERCHANTS_NOT_EXIST;
        }
        return ErrorCode.SUCCESS;
    }
}
