package com.driver;


public class Main {

    public static class A {
        String meth() {
            return "Invoking method from class A";
        }
    }

    public static class B extends A {
        @Override
        String meth() {
            return "Method is overridden in Extended class B";
        }
    }

    public static void main(String[] args) {
        // Task 3
        B objB = new B();
        B obj1 = new B();
        System.out.println(objB.meth());
        System.out.println(obj1.meth());
    }
}

