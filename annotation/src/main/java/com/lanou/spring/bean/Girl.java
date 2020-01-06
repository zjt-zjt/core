package com.lanou.spring.bean;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Girl {

    public Girl(String name) {
        this.name = name;
    }

    public Girl() {
    }

    private  String name;
}
