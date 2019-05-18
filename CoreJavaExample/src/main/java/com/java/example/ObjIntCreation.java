package com.java.example;

@FunctionalInterface
interface IntSupplier {
    ObjIntCreation apply(int n);
}
@FunctionalInterface
interface IntObjectSupplier {
    ObjIntCreation apply(ObjIntCreation obj);
}
public class ObjIntCreation {
    private int num;
    public ObjIntCreation(int num) {
        this.num = num;
    }
    public ObjIntCreation(ObjIntCreation n) {
        this.num = n.num;
    }
    public static void main(String[] args) {
        // using the "IntSupplier" functional interface
        int num = 10;
        IntSupplier s1 = ObjIntCreation::new;
        ObjIntCreation newObj1 = s1.apply(num);
        System.out.println("new object has a instance value " + newObj1.num);
        // using the "IntObjectSupplier" functional interface
        IntObjectSupplier s2 = ObjIntCreation::new;
        ObjIntCreation newObj = s2.apply(newObj1);
        System.out.println("new object has a instance value " + newObj.num);
    }
}
