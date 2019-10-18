package com.dakai.service.impl;

import com.dakai.service.BusinessService;
import com.dakai.strategypattern.strategy.StrategyContext;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/**
 * 业务处理Service实现
 * @author ChenErGao
 * @date 2019/8/26 11:19 下午
 */
public class BusinessServiceImpl implements BusinessService {

    @Autowired
    private StrategyContext strategyContext;


}
