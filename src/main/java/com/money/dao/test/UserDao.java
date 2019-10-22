package com.money.dao.test;

/*
 * @author:liuzhaolu
 * @createTime: 2019-10-22 18:17
 * @desc:
 */

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao<User> {

    List<User> selectId(String username);

}
