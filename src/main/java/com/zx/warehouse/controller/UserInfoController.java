package com.zx.warehouse.controller;

import com.zx.warehouse.bean.UserInfoBean;
import com.zx.warehouse.common.CommonResult;
import com.zx.warehouse.pojo.CompanyModel;
import com.zx.warehouse.pojo.UserInfoModel;
import com.zx.warehouse.service.UserInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * @Description
 * @Date 2019/11/19 17:08
 * @Created by cc
 */
@Slf4j
@RestController
@Api(tags = "用户信息管理")
@RequestMapping("/userInfo")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @ApiOperation(value = "查询用户信息",notes = "查询用户信息")
    @RequestMapping(value = "/v1/getUser/{userId}",method = RequestMethod.GET)
    public CommonResult getUserInfoById(@PathVariable(value = "userId",required = false) String userId){

        CommonResult commonResult = new CommonResult();
        try{
            UserInfoModel userInfoModel = userInfoService.getUserInfo(userId);
            commonResult.setRetCode(200);
            commonResult.setRetMessage("success");
            commonResult.setData(userInfoModel);
        }catch (Exception e){
            log.error("zx-system: getUserInfoById error!{}",e);
            commonResult.setRetCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
            commonResult.setRetMessage("查询用户信息失败");
        }
        return commonResult;
    }


    @ApiOperation(value = "用户登陆接口",notes = "用户登陆接口")
    @RequestMapping(value = "/v1/login",method = RequestMethod.GET)
    public CommonResult login(@ApiParam(value = "用户名",required = true) @RequestParam(value = "username",required = true)String userName,
                              @ApiParam(value = "密码",required = true) @RequestParam(value = "password",required = true)String password){
        CommonResult commonResult = new CommonResult();

//        try{
//
//        }catch (Exception e){
//
//        }

        return commonResult;
    }

}
