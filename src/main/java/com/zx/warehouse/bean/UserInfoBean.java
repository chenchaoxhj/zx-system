package com.zx.warehouse.bean;

import lombok.Data;

/**
 * @Description
 * @Date 2019/11/19 17:13
 * @Created by cc
 */
@Data
public class UserInfoBean {

    private String name;

    private String sex;

    //身份证号
    private String id;

    private Integer age;
}
