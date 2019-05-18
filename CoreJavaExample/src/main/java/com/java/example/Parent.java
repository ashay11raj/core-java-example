package com.java.example;

public class Parent {
    {
        System.out.println("I am Parent init..");
    }
    static {
        System.out.println("I am Parent static..");
    }
    Parent(){
        System.out.println("I am Parent constructor..");
    }
}
