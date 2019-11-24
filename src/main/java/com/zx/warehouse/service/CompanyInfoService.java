package com.zx.warehouse.service;

import com.zx.warehouse.pojo.CompanyModel;
import com.zx.warehouse.pojo.DeptModel;

/**
 * @Author: cc
 * @Date: 2019/11/23 15:11
 * @Description: *
 */
public interface CompanyInfoService {

    /**
     * 新增公司信息
     * @param companyModel
     */
    void addCompanyInfo(CompanyModel companyModel);

    /**
     * 新增部门信息
     * @param deptModel
     */
    void addDepartmentInfo(DeptModel deptModel) throws Exception;


}
