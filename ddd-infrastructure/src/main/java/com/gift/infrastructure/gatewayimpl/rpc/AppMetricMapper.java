package com.gift.infrastructure.gatewayimpl.rpc;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gift.infrastructure.gatewayimpl.rpc.dataobject.AppMetricDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AppMetricMapper extends BaseMapper<AppMetricDO> {
}
