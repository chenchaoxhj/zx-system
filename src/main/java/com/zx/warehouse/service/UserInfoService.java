package com.zx.warehouse.service;

import com.zx.warehouse.pojo.UserInfoModel;

/**
 * @Description
 * @Date 2019/11/19 17:31
 * @Created by cc
 */
public interface UserInfoService {

    /**
     * 获取用户信息
     * @param id
     * @return
     */
    UserInfoModel getUserInfo(String id);

    /**
     * 鉴别登陆用户的用户名和密码
     * @param username
     * @param password
     * @return
     */
    int getLoginUser(String username,String password);
}
