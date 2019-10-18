package com.dakai.strategypattern;

import com.dakai.StrategyPatternApplication;
import com.dakai.strategypattern.enums.StrategyEnum;
import com.dakai.strategypattern.strategy.Strategy;
import com.dakai.strategypattern.strategy.StrategyContext;
import com.dakai.strategypattern.strategy.domain.StrategyParam;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author ChenErGao
 * @date 2019/9/30 9:32 上午
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = StrategyPatternApplication.class)
@WebAppConfiguration
public class StrategyTest {

    @Autowired
    private StrategyContext strategyContext;

    @Test
    public void test(){

        StrategyParam strategyParamOne = new StrategyParam();
        strategyParamOne.setStrategyEnum(StrategyEnum.STRATEGY_A);
        strategyContext.invokeContext(strategyParamOne);

        StrategyParam strategyParamTwo = new StrategyParam();
        strategyParamTwo.setStrategyEnum(StrategyEnum.STRATEGY_B);
        strategyContext.invokeContext(strategyParamTwo);

        StrategyParam strategyParamThree = new StrategyParam();
        strategyParamThree.setStrategyEnum(StrategyEnum.STRATEGY_C);
        strategyContext.invokeContext(strategyParamThree);
    }
}
