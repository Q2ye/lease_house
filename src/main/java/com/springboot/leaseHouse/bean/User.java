package com.springboot.leaseHouse.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @ClassName User
 * @Description //TODO  用户列表
 * @Author 秦野
 * @Date 2021/9/23 11:37
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class User {
    private Integer uerId;
    private String userName;
    /**
     * 性别：1男 2女
     */
    private String userGender;
    private String userBirthday;
    /**
     * 身份证号
     */
    private String userIdNumber;
    /**
     * 籍贯
     */
    private String userNativePlace;
    /**
     * 现住址
     */
    private String userAddress;
    /**
     * 头像地址
     */
    private String userPicturePath;
    /**
     * 电话
     */
    private String userTel;
    /**
     * 注册时间
     */
    private String userRegistTime;
    /**
     * 激活状态：0：用户   1：管理员
     */
    private Integer userState;
    
    
    
    
    
    

    
    
    
    
    
    
    
    

}
