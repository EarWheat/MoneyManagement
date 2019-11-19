package com.money.serviceImpl.test;

import com.money.dao.test.UserDao;
import com.money.entity.User;
import com.money.service.test.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/*
 * @author:liuzhaolu
 * @createTime: 2019-10-22 18:20
 * @desc:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public User getUserInfoById(String userId){
        User user = userDao.selectById(userId);
        return user;
    }

    public User getUserInfoByUserName(String userName){
        User user = userDao.selectByUserName(userName);
        return user;
    }
}
