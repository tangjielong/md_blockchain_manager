package com.mindata.blockmanager.bean;

import com.mindata.blockmanager.model.Permission;

import java.util.List;

/**
 * @author wuweifeng wrote on 2018/4/10.
 */
public class PermissionData extends BaseData {
    private List<Permission> permissions;

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }
}
