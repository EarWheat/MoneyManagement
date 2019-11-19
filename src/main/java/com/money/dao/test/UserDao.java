package com.money.dao.test;

/*
 * @author:liuzhaolu
 * @createTime: 2019-10-22 18:17
 * @desc:
 */

import com.money.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

public interface UserDao {

    User selectById(@Param("userId")String userId);

    User selectByUserName(@Param("userName")String userName);
}
