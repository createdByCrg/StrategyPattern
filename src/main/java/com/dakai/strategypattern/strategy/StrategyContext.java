package com.dakai.strategypattern.strategy;

import com.dakai.strategypattern.enums.StrategyEnum;
import com.dakai.strategypattern.strategy.domain.BizResult;
import com.dakai.strategypattern.strategy.domain.StrategyParam;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ChenErGao
 * @date 2019/8/27 11:25 下午
 */
@Component
public class StrategyContext {

    public Map<StrategyEnum, Strategy> strategyMap = new HashMap<>(3);

    /**
     * 执行策略上下文
     * @param strategyParam 策略参数
     * @return 业务处理返回封装实体
     */
    public BizResult invokeContext(StrategyParam strategyParam){

        if (strategyParam == null){

            throw new IllegalArgumentException("执行策略参数不能为空！");
        }

        // 获取策略参数中枚举实例
        StrategyEnum strategyEnum = strategyParam.getStrategyEnum();

        // 通过枚举实例Get对应策略类
        Strategy strategy = strategyMap.get(strategyEnum);

        // 执行策略方案
        return strategy.invokeStrategy(strategyParam);
    }
}
