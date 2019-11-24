package com.zx.warehouse.service.impl;

import com.zx.warehouse.mapper.UserInfoMapper;
import com.zx.warehouse.pojo.UserInfoModel;
import com.zx.warehouse.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Date 2019/11/19 17:38
 * @Created by cc
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfoModel getUserInfo(String id) {
        return userInfoMapper.getUserInfo(id);
    }

    @Override
    public int getLoginUser(String username, String password) {

        return 0;
    }
}
