package com.company;

import java.util.Objects;

class Person{

    private int id;
    private String name;

    public Person(int id , String name)
    {
        this.id=id;
        this.name = name;
    }
    @Override
    public String toString(){
        return "Person[id="+id+",name="+name+"]" ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return id == person.id &&
                name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class Main {

    public static void main(String[] args) {

        Person personAkin = new Person(1,"akin");
        Person personDoga = new Person(1,"akin");



        System.out.println(personAkin.equals(personDoga));
    }
}
