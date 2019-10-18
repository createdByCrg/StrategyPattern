package com.dakai.strategypattern.strategy.impl;

import com.dakai.strategypattern.annotation.BusinessStrategy;
import com.dakai.strategypattern.enums.StrategyEnum;
import com.dakai.strategypattern.strategy.Strategy;
import com.dakai.strategypattern.strategy.domain.BizResult;
import com.dakai.strategypattern.strategy.domain.StrategyParam;
import org.springframework.stereotype.Component;

/**
 * @author ChenErGao
 * @date 2019/8/27 11:30 下午
 */
@Component
@BusinessStrategy
public class StrategyA implements Strategy {
    @Override
    public BizResult invokeStrategy(StrategyParam strategyParam) {

        System.out.println("正在执行StrategyA......");
        return new BizResult();
    }

    @Override
    public StrategyEnum getStrategyEnum() {
        return StrategyEnum.STRATEGY_A;
    }
}
