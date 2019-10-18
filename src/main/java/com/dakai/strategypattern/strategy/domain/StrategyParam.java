package com.dakai.strategypattern.strategy.domain;

import com.dakai.strategypattern.enums.StrategyEnum;

/**
 * 调用策略类参数封装实体
 * @author ChenErGao
 * @date 2019/8/30 11:40 下午
 */
public class StrategyParam {

    /**
     * 策略枚举实例
     */
    private StrategyEnum strategyEnum;

    public StrategyEnum getStrategyEnum() {
        return strategyEnum;
    }

    public void setStrategyEnum(StrategyEnum strategyEnum) {
        this.strategyEnum = strategyEnum;
    }
}
