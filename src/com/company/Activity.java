package com.company;

public class Activity {

    public int a = 10;
    protected boolean is_active = false;
    private String name = null;

    public Activity(String name){
        this.name = name;
    }

    public void show(){
        this.is_active = true;
    }
}
