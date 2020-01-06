package com.lanou.spring.bean;




import com.lanou.spring.mycompoent.MyComponent;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

@Getter
@Setter
//@Component
@MyComponent  //使用派生自@Component注解的自定义注解实现bean定义功能
//@Scope(scopeName = "prototype")
public class King {
    @Value("李世民")
  private  String name;

    @Autowired
    @Qualifier("girl")

    //@Resource 等同于上面的作用
   private Girl girl;

}
