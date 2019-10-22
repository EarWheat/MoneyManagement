package com.money.serviceImpl.test;

import org.apache.ibatis.annotations.Param;

import java.awt.print.Book;
import java.util.List;

/*
 * @author:liuzhaolu
 * @createTime: 2019-10-22 17:44
 * @desc:
 */
public interface bookImpl {
    Book queryById(long id);

    List<Book> queryAll(@Param("offset") int offset, @Param("limit") int limit);

}
