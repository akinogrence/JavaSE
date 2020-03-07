package com.company;

import java.io.Serializable;

public class Person implements Serializable {

    private int id;
    private String name ;
    private static final long serialVersionUID = 2131313131313113L;

    public Person(int id,String name){
        this.id = id;
        this.name = name;

    }

    @Override
    public String toString() {
        return "Person [id ="+id+",name="+name+"]" ;
    }
}
