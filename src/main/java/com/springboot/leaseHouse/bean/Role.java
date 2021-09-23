package com.springboot.leaseHouse.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @ClassName Role
 * @Description //TODO  角色列表
 * @Author 秦野
 * @Date 2021/9/2311:56
 */
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Role {
    private Integer roleId;
    /**
     * 角色名称
     */
    private String roleName;
    /**
     * 关联菜单id
     * 1：管理员所有菜单
     * 2：员工没有用户管理权限
     * 3：普通用户只能查看房屋
     */
    private String roleMenuId;
    
    
    
    
    
}
