package com.gift.domain;

import com.gift.domain.user.UserInfo;


/**
 * 领域工厂
 * 领域工厂生产实体，由于会被多次使用，工厂方法采用静态方法
 */
public class DomainFactory {



    public static UserInfo getUserInfo() {

        return new UserInfo();
    }


}
