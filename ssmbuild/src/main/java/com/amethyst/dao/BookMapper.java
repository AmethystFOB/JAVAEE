package com.amethyst.dao;

import com.amethyst.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    //增加一本书
    int addBooks(Books books);
    //删除一本书
    int deleteBookById(@Param("bookId") int id);
    //修改一本书
    int updateBook(Books books);
    //查询一本书
    Books queryBookById(@Param("bookId") int id);
    //查询全部的书
    List<Books> queryAllBook();
}
