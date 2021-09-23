package com.springboot.leaseHouse.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springboot.leaseHouse.bean.User;
import org.springframework.stereotype.Component;

/**
 * @ClassName UserMapper
 * @Description //TODO  ：使用mybatis_plus实现crud
 * @Author 秦野
 * @Date 2021/9/2313:49
 */
@Component
public interface UserMapper extends BaseMapper<User> {
}
