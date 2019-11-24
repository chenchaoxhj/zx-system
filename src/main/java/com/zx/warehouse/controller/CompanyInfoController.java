package com.zx.warehouse.controller;

import com.zx.warehouse.common.CommonResult;
import com.zx.warehouse.pojo.CompanyModel;
import com.zx.warehouse.pojo.DeptModel;
import com.zx.warehouse.service.CompanyInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Author: cc
 * @Date: 2019/11/23 14:55
 * @Description: *
 */

@Slf4j
@RestController
@Api(tags = "公司信息管理")
@RequestMapping("/companyInfo")
public class CompanyInfoController {


    @Autowired
    private CompanyInfoService companyInfoService;

    @ApiOperation(value = "新增公司",notes = "新增公司")
    @RequestMapping(value = "/v1/addCompany",method = RequestMethod.POST)
    public CommonResult addCompanyInfo(@RequestBody CompanyModel companyModel){
        CommonResult commonResult = new CommonResult();

        try{
            if (companyModel.getCompanyId().equals("")){
                companyModel.setCompanyId(UUID.randomUUID().toString());
            }
            companyInfoService.addCompanyInfo(companyModel);
            commonResult.setRetCode(200);
            commonResult.setRetMessage("success");
        }catch (Exception e){
            log.error("addCompanyInfo error! {}",e);
            commonResult.setRetCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
            commonResult.setRetMessage("新增公司信息失败！");
        }

        return commonResult;
    }


    @ApiOperation(value = "新增部门",notes = "新增部门")
    @RequestMapping(value = "/v1/addDepartment",method = RequestMethod.POST)
    public CommonResult addDeptCompany(@RequestBody DeptModel deptModel){
        CommonResult commonResult = new CommonResult();

        try{
            if (deptModel.getDeptId().equals("")){
                deptModel.setDeptId(UUID.randomUUID().toString());
            }
            companyInfoService.addDepartmentInfo(deptModel);
            commonResult.setRetCode(200);
            commonResult.setRetMessage("success");

        }catch (Exception e){
            log.error("addDeptCompany error! {}",e);
            commonResult.setRetCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
            commonResult.setRetMessage("新增部门失败");
        }
        return commonResult;
    }
}
