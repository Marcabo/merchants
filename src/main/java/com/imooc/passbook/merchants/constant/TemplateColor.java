package com.imooc.passbook.merchants.constant;

/**
 * @Description 优惠卷背景颜色
 * @auther wubo25320
 * @create 2020-07-22 20:58
 */
public enum TemplateColor {
    RED(1, "红色"),
    GREEN(2, "绿色"),
    BLUE(3, "蓝色");

    /** 颜色代码 */
    private Integer code;
    /** 颜色描述 */
    private String color;

    TemplateColor(Integer code, String color) {
        this.code = code;
        this.color = color;
    }

    public Integer getCode() {
        return code;
    }

    public String getColor() {
        return color;
    }
}
