package com.gift.infrastructure.gatewayimpl.database.dataobject;

/**
 * 数据映射对象
 */
public class UserInfoDo extends BaseDO {

    private String userName;

    private String number;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
