package com.dakai.strategypattern.enums;

/**
 * @author ChenErGao
 * @date 2019/8/27 11:14 下午
 */
public enum StrategyEnum {

    /**
     * 策略A枚举
     */
    STRATEGY_A(1, "策略A"),

    /**
     * 策略B枚举
     */
    STRATEGY_B(2, "策略B"),

    /**
     * 策略C枚举
     */
    STRATEGY_C(3, "策略C");

    private int strategyType;

    private String typeDescription;

    StrategyEnum(int strategyType, String typeDescription) {
        this.strategyType = strategyType;
        this.typeDescription = typeDescription;
    }

    public int getStrategyType() {
        return strategyType;
    }

    public String getTypeDescription() {
        return typeDescription;
    }
}
