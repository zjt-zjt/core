package com.lanou.spring.bean;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Setter
@Getter
public class Man {

    public Man(Book book) {
        this.book = book;
    }
    private  String name;
    private List<String> hobbies;
    private Map<String,String> game;
    private Man friend;
    private  String sex;
    private  Book book;
    public Man(){

    }

    public Man(String name) {
        this.name = name;
    }
}
