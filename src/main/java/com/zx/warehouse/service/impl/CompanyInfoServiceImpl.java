package com.zx.warehouse.service.impl;

import com.zx.warehouse.mapper.CompanyInfoMapper;
import com.zx.warehouse.pojo.CompanyModel;
import com.zx.warehouse.pojo.DeptModel;
import com.zx.warehouse.service.CompanyInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: cc
 * @Date: 2019/11/23 15:12
 * @Description: *
 */
@Service
public class CompanyInfoServiceImpl implements CompanyInfoService {

    @Autowired
    private CompanyInfoMapper companyInfoMapper;

    @Override
    public void addCompanyInfo(CompanyModel companyModel) {
        companyInfoMapper.addCompanyInfo(companyModel);
    }

    @Override
    public void addDepartmentInfo(DeptModel deptModel) throws Exception {

        //先判断公司ID是否存在
        String companyId = deptModel.getCompanyId();

        List<CompanyModel> companyModels = companyInfoMapper.getCompanyInfos(companyId);

        if (companyModels == null || companyModels.size() == 0){
            throw new Exception("公司id不存在！");
        }

        companyInfoMapper.addDepartmentInfo(deptModel);
    }
}
