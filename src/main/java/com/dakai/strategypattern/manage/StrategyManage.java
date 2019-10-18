package com.dakai.strategypattern.manage;

import com.dakai.strategypattern.annotation.BusinessStrategy;
import com.dakai.strategypattern.strategy.Strategy;
import com.dakai.strategypattern.strategy.StrategyContext;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * 策略类管理器
 * @author ChenErGao
 * @date 2019/8/26 11:07 下午
 */
@Component
public class StrategyManage implements BeanPostProcessor {

    @Autowired
    private StrategyContext strategyContext;

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        // 判断Bean是否被自定义注解标示
        if (bean instanceof Strategy && bean.getClass().isAnnotationPresent(BusinessStrategy.class)){

            // 将策略类强转为顶层策略接口
            Strategy strategy = (Strategy) bean;

            // 将策略类添加到策略Map中
            strategyContext.strategyMap.put(strategy.getStrategyEnum(), strategy);
        }
        return bean;
    }
}
