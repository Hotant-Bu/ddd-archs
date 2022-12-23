package com.gift.infrastructure.gatewayimpl;

import com.gift.infrastructure.repository.AppMetricRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class AppMetricGatewayImpl {

    @Resource
    private AppMetricRepository appMetricRepository;


}
