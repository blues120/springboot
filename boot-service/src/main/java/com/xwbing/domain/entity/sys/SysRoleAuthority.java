package com.xwbing.domain.entity.sys;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 说明: 角色权限关系
 * 项目名称: boot-module-pro
 * 创建时间: 2017/5/10 16:36
 * 作者:  xiangwb
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SysRoleAuthority extends BaseEntity {
    private static final long serialVersionUID = 1241064470335852429L;
    public static String table = "sys_role_authority";
    /**
     * 角色主键
     */
    private String roleId;
    /**
     * 权限主键
     */
    private String authorityId;
}
