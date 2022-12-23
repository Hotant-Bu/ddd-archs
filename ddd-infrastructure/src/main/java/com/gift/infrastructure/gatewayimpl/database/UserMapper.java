package com.gift.infrastructure.gatewayimpl.database;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gift.infrastructure.gatewayimpl.database.dataobject.UserInfoDo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<UserInfoDo> {
}
