package com.lanou.spring;

import com.lanou.spring.bean.Man;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public class injection extends test{
    @Autowired
    private ApplicationContext ctx;

    @Test
    public  void ConstructorTest(){
     Man man= ctx.getBean("lisi", Man.class);
      System.out.println(ReflectionToStringBuilder.toString(man));
        System.out.println(man.getSex().length());
  }
@Test
public  void cTest(){
    Man man= ctx.getBean("孙尚香", Man.class);
    System.out.println(man.getName());
}

    @Test
    public  void pTest(){
        Man man= ctx.getBean("刘备", Man.class);
        System.out.println(man.getName());
        System.out.println(ReflectionToStringBuilder.toString(man));
    }

    @Test
    public  void internalTest(){
        Man man= ctx.getBean("张飞", Man.class);
        System.out.println(man.getFriend().getName());
        System.out.println(man.getName());
        System.out.println(ReflectionToStringBuilder.toString(man.getFriend()));
    }

    @Test
    public  void nullTest(){
        Man man= ctx.getBean("赵云", Man.class);
        System.out.println(man.getSex().length());

    }

    @Test
    public  void null1Test(){
        Man man= ctx.getBean("赵云", Man.class);
        System.out.println(man.getSex());

    }

    @Test
    public  void compositeTest(){
        Man man= ctx.getBean("book", Man.class);
        System.out.println(man.getBook().getBookName());

    }

    @Test
    public  void autoTest(){
        Man man= ctx.getBean("cc", Man.class);
        System.out.println(man.getName() + "最喜欢看的一本书：" + man.getBook().getBookName());

    }
}
