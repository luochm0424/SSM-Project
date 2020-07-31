package com.lcm.service.impl;

import com.lcm.pojo.Permission;
import com.lcm.mapper.PermissionMapper;
import com.lcm.service.PermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Permission)表服务实现类
 *
 * @author makejava
 * @since 2020-07-30 16:01:43
 */
@Service("permissionService")
public class PermissionServiceImpl implements PermissionService {
    @Resource
    private PermissionMapper permissionMapper;


    @Override
    public Permission queryById(Integer permissionId) {
        return this.permissionMapper.queryById(permissionId);
    }




    @Override
    public Permission insert(Permission permission) {
        this.permissionMapper.insert(permission);
        return permission;
    }

    @Override
    public Permission update(Permission permission) {
        this.permissionMapper.update(permission);
        return this.queryById(permission.getPermissionId());
    }


    @Override
    public boolean deleteById(Integer permissionId) {
        return this.permissionMapper.deleteById(permissionId) > 0;
    }
}