package com.money.serviceImpl.test;

import com.money.dao.test.UserDao;
import com.money.entity.User;
import com.money.service.test.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 * @author:liuzhaolu
 * @createTime: 2019-10-22 18:20
 * @desc:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao<User> dao;

    public boolean doUserLogin(User user) {
        List<User> list = dao.selectId(user.getUsername());
        if(list.size() == 0){
            return false;
        }else{
            if(list.get(0).getPassword().equals(user.getPassword())){
                return true;
            }else{
                return false;
            }
        }
    }

    public User getUserInfoById(String userId){
        User user = dao.selectById(userId);
        return user;
    }
}
