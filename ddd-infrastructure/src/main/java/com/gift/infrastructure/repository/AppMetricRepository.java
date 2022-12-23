package com.gift.infrastructure.repository;

import com.gift.infrastructure.gatewayimpl.rpc.AppMetricMapper;
import com.gift.infrastructure.gatewayimpl.rpc.dataobject.AppMetricDO;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class AppMetricRepository {

    @Resource
    private AppMetricMapper appMetricMapper;


}
