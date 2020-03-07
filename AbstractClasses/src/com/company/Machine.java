package com.company;

public abstract class Machine {

    private int id;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract void start();
    public void Run(){
        start();
    }




}
