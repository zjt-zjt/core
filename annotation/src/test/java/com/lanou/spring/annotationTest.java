package com.lanou.spring;

import com.lanou.spring.bean.King;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public class annotationTest extends test {
    @Autowired
    private King king;
    @Autowired
    private ApplicationContext ctx;

    @Test
    public void testAuto() {
        System.out.println(king.getName() + "选中了" + king.getGirl().getName());
    }


//    @Test
//    public void testScope() {
//        King king1 = ctx.getBean(King.class);
//        King king2 = ctx.getBean(King.class);
//        King king3 = ctx.getBean(King.class);
//        System.out.println("king1:" + king1);
//        System.out.println("king2:" + king2);
//        System.out.println("king3:" + king3);
//
//    }
}