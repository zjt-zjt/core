package com.lanou.spring;

import com.lanou.spring.bean.Book;
import com.lanou.spring.dao.BookDao;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class bookDao   extends test {
     @Autowired
   private BookDao book;

    @Test
    public void testSelect() {
        List<Book> bookList = book.select();
        for(Book book : bookList) {
            String result = ReflectionToStringBuilder.toString(book, ToStringStyle.NO_CLASS_NAME_STYLE);
            System.out.println(result);
        }

    }

}
