package com.mtons.mblog.modules.service;

import com.mtons.mblog.modules.entity.Permission;
import com.mtons.mblog.modules.entity.RolePermission;

import java.util.List;
import java.util.Set;

/**
 * @author - langhsu
 */
public interface RolePermissionService {
    List<Permission> findPermissions(long roleId);
    void deleteByRoleId(long roleId);
    void add(Set<RolePermission> rolePermissions);

}
