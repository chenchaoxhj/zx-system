package com.zx.warehouse.mapper;

import com.zx.warehouse.pojo.UserInfoModel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @Description
 * @Date 2019/11/19 17:33
 * @Created by cc
 */
@Repository
public interface UserInfoMapper {

    UserInfoModel getUserInfo(@Param("id") String id);

    int getLoginUser(String username,String password);
}
