package com.springboot.leaseHouse.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @ClassName Loginer
 * @Description //TODO
 * @Author 秦野
 * @Date 2021/9/2311:59
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Loginer {
    private Integer loginerId;
    private String loginerName;
    private String loginerPassword;
    /**
     * 角色id：0：普通用户   1：管理员
     */
    private Integer loginerRoleId;
    /**
     * 用户id
     */
    private Integer loginerUserId;
    /**
     * 登录时间
     */
    private String loginerLoginTime;
    /**
     * 是否租客 1：员工  0：租客
     */
    private Integer loginerIsRenter;
    
    
    
    
    
    
}
