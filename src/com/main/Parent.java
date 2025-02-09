package com.main;

public class Parent {

    String name = "";

    public Parent(String n) {
        this.name = n;
    }

    public void show_name(){
        System.out.println("The name is " + name);
    }
}
