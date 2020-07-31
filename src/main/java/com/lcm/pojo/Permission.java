package com.lcm.pojo;

import java.io.Serializable;

/**
 * (Permission)实体类
 *
 * @author makejava
 * @since 2020-07-30 16:02:20
 */
public class Permission implements Serializable {
    private static final long serialVersionUID = 992406827412247068L;
    
    private Integer permissionId;
    
    private String permissionName;
    
    private String permissionDesc;


    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public String getPermissionDesc() {
        return permissionDesc;
    }

    public void setPermissionDesc(String permissionDesc) {
        this.permissionDesc = permissionDesc;
    }

}