package com.java.example;

public class Child extends Parent{
    {
        System.out.println("I am Child init..");
    }
    static {
        System.out.println("I am Child static..");
    }
    Child(){
        System.out.println("I am Child constructor..");
    }
}
