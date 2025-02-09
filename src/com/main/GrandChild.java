package com.main;

public class GrandChild extends Child{

    String gender = "";

    public GrandChild(String n, int a, String g) {
        super(n, a);
        this.gender = g;
    }

    public void show_gender(){
        System.out.println("The gender is " + gender);
    }
}
