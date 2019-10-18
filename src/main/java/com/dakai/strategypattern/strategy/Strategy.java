package com.dakai.strategypattern.strategy;

import com.dakai.strategypattern.annotation.BusinessStrategy;
import com.dakai.strategypattern.enums.StrategyEnum;
import com.dakai.strategypattern.strategy.domain.BizResult;
import com.dakai.strategypattern.strategy.domain.StrategyParam;

/**
 * @author ChenErGao
 * @date 2019/8/27 11:27 下午
 */
public interface Strategy {


    /**
     * 调用策略方法
     * @param strategyParam 执行策略方案参数
     * @return 业务处理返回结果封装实体
     */
    BizResult invokeStrategy(StrategyParam strategyParam);

    /**
     * 获取当前对象对应枚举
     * @return 策略枚举
     */
    StrategyEnum getStrategyEnum();
}
