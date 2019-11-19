package com.money.service.test;

import com.money.entity.User;

/*
 * @author:liuzhaolu
 * @createTime: 2019-10-22 18:19
 * @desc:
 */
public interface UserService {

    User getUserInfoById(String userId);

    User getUserInfoByUserName(String userName);
}
