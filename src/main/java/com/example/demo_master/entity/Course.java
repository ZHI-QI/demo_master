package com.example.demo_master.entity;

import java.io.Serializable;

/**
 * 权限嘞
 * @Auther: wangzhiqi
 * @Date: 2019/9/27 10:16
 * @Description:
 */
public class Course implements Serializable {


    private static final long serialVersionUID = 7972552526254472433L;

    private String permissionName;

    public Course(String permissionName) {
        this.permissionName = permissionName;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }
}
