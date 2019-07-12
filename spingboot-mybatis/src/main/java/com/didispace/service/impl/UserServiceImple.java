package com.didispace.service.impl;

import com.didispace.bean.User;
import com.didispace.dao.UserDao;
import com.didispace.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImple implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public User getUser(Long id) {
        return  userDao.getUser(id);
    }

}
