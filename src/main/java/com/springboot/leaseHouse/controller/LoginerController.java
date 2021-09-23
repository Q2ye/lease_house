package com.springboot.leaseHouse.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.springboot.leaseHouse.bean.Loginer;
import com.springboot.leaseHouse.service.impl.LoginerServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName LoginerController
 * @Description //TODO
 * @Author 秦野
 * @Date 2021/9/2314:36
 */
@RestController
public class LoginerController {

    @Resource
    private LoginerServiceImpl loginerService;

    @RequestMapping("/login")
    public String loginer(@Param("loginerName")String name,
                          @Param("loginerPassword")String password){
        QueryWrapper<Loginer>  queryWrapper = new QueryWrapper<>();

        Map<String,String> map=new HashMap<>();
        map.put("loginerName",name);
        map.put("loginerPassword",password);

        queryWrapper.allEq(map);
        Loginer loginer = loginerService.getOne(queryWrapper);
        if (loginer!=null){
            return "登录成功";
        }else{
            return "登录失败";
        }

    }

}
