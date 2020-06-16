package com.wjj.dao;

import com.wjj.pojo.Books;

import java.util.List;


public interface BookMapper {
    int addBook(Books book);

    int deleteBookById(int id);

    int updateBook(Books book);

    Books queryBookById(int id);

    List<Books> queryAllBook();
}
