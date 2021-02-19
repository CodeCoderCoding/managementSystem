package com.supremepole.annotation;

import com.supremepole.enums.BusinessType;
import com.supremepole.enums.OperatorType;

/**
 * 自定义操作日志记录注解
 * @author supremepole
 */
public @interface Log {
    /**
     * 模块
     */
    public String title() default "";

    /**
     * 功能
     */
    public BusinessType businessType() default BusinessType.OTHER;

    /**
     * 操作人类别
     */
    public OperatorType operatorType() default OperatorType.MANAGE;

    /**
     * 是否保存请求的参数
     */
    public boolean isSaveRequestData() default true;
}
