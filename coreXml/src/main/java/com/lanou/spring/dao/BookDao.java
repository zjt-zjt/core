package com.lanou.spring.dao;

import com.lanou.spring.bean.Book;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.List;
@Getter
@Setter
//@Component
public class BookDao {

//    public BookDao(QueryRunner queryRunner) {
//        this.queryRunner = queryRunner;
//    }

    // @Autowired
    private QueryRunner queryRunner;

    public List<Book> select() {
        String sql = "select book_no bookNO, book_name bookName, book_type bookType, author from book;";
        try {
            List<Book> bookList = queryRunner.query(sql, new BeanListHandler<Book>(Book.class));
            return bookList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }



}
