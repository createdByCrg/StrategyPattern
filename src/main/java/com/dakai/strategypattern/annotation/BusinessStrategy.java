package com.dakai.strategypattern.annotation;

import java.lang.annotation.*;

/**
 * 业务策略注解
 * @author ChenErGao
 * @date 2019/8/26 11:26 下午
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Inherited
public @interface BusinessStrategy {
}
