package com.lcm.mapper;

import com.lcm.pojo.Permission;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Permission)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-30 16:01:33
 */
public interface PermissionMapper {


    Permission queryById(Integer permissionId);


    List<Permission> queryPermissionByUserName(String username);

    List<Permission> queryAll(Permission permission);


    int insert(Permission permission);


    int update(Permission permission);


    int deleteById(Integer permissionId);

}