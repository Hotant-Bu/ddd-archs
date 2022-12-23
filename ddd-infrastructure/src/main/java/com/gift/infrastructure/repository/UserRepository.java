package com.gift.infrastructure.repository;

import com.gift.infrastructure.gatewayimpl.database.UserMapper;
import com.gift.infrastructure.gatewayimpl.database.dataobject.UserInfoDo;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class UserRepository {

    @Resource
    private UserMapper userMapper;



    public void save(UserInfoDo userInfoDo){


        userMapper.insert(userInfoDo);
    }







}
