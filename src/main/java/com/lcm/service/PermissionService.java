package com.lcm.service;

import com.lcm.pojo.Permission;
import java.util.List;

/**
 * (Permission)表服务接口
 *
 * @author makejava
 * @since 2020-07-30 16:01:43
 */
public interface PermissionService {


    Permission queryById(Integer permissionId);


    Permission insert(Permission permission);


    Permission update(Permission permission);


    boolean deleteById(Integer permissionId);

}