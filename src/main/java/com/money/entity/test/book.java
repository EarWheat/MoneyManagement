package com.money.entity.test;

/*
 * @author:liuzhaolu
 * @createTime: 2019-10-22 18:15
 * @desc:
 */
public class book {
    private long bookId;// 图书ID

    private String name;// 图书名称

    private int number;// 馆藏数量

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}