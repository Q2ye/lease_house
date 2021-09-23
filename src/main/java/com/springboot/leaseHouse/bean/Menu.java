package com.springboot.leaseHouse.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @ClassName Menu
 * @Description //TODO
 * @Author 秦野
 * @Date 2021/9/2313:38
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Menu {
    
    private Integer menuId;
    /**
     * 菜单名称
     */
    private String menuName;
    /**
     * 关联显示地址
     */
    private String menuAddress;
    
    
    
    
    
}
