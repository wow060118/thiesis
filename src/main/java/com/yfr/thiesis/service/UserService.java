package com.yfr.thiesis.service;

import com.yfr.thiesis.dao.UserDao;
import com.yfr.thiesis.model.UserEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private UserDao userDao;

    public UserEntity getUser(String username){
        return userDao.getUser(username);
    }
}
