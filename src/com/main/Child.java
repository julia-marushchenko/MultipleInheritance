package com.main;

public class Child extends Parent{

    int age = 0;

    public Child(String n, int a) {
        super(n);
        this.age = a;
    }

    public void show_age() {
        System.out.println("The age is " + age);
    }

}
