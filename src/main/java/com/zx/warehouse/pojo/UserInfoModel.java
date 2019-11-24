package com.zx.warehouse.pojo;

import lombok.Data;

/**
 * @Description
 * @Date 2019/11/19 17:32
 * @Created by cc
 */
@Data
public class UserInfoModel {

    private String name;

    private String sex;

    //身份证号
    private String id;

    private Integer age;
}
