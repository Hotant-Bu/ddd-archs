package com.gift.infrastructure.gatewayimpl;

import com.gift.domain.gateway.UserInfoGateway;
import com.gift.domain.user.UserInfo;
import com.gift.infrastructure.convertor.UserInfoConvertor;
import com.gift.infrastructure.repository.UserRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class UserGatewayImpl implements UserInfoGateway {

    @Resource
    private UserRepository userRepository;


    @Override
    public void create(UserInfo userInfo) {

        userRepository.save(UserInfoConvertor.toDataObjectForCreate(userInfo));

    }
}
