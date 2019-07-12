package com.didispace.dao;

import com.didispace.bean.User;
import org.springframework.stereotype.Repository;

// @Repository 用来扫描加载MyBatis接口bean
// 也可使用@Mapper注解
@Repository
public interface UserDao {

    // 方法名getUser 需要和 userMapper select id 一致
    public User getUser(Long id);
}
