package com.gift.infrastructure.convertor;

import com.gift.domain.user.UserInfo;
import com.gift.infrastructure.gatewayimpl.database.dataobject.UserInfoDo;

/**
 * 转换器
 */
public class UserInfoConvertor {


    /**
     * 用户对象存储转换器，
     *
     * @param userInfo
     * @return
     */
    public static UserInfoDo toDataObjectForCreate(UserInfo userInfo) {

        UserInfoDo userInfoDo = new UserInfoDo();

        userInfoDo.setUserName(userInfo.getUserName());
        userInfoDo.setNumber(userInfo.getNumber());
        userInfoDo.setCreateTime(userInfo.getCreateTime());
        userInfoDo.setUpdateTime(userInfo.getUpdateTime());

        return userInfoDo;
    }


}
