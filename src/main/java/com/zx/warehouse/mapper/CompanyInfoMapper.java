package com.zx.warehouse.mapper;

import com.zx.warehouse.pojo.CompanyModel;
import com.zx.warehouse.pojo.DeptModel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: cc
 * @Date: 2019/11/23 15:13
 * @Description: *
 */

@Repository
public interface CompanyInfoMapper {

    void addCompanyInfo(CompanyModel companyModel);

    List<CompanyModel> getCompanyInfos(@Param("companyId") String companyId);

    void addDepartmentInfo(DeptModel deptModel);
}
