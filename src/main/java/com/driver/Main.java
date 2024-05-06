package com.driver;


public class Main {

    public static class A {
        public String meth() {
            return "Invoking method from class A";
        }
    }

    public static class B extends A {
        @Override
        public String meth() {
            return "Method is overridden in Extended class B";
        }
    }

    public static void main(String[] args) {
        // Task 3
        B objB = new B();
        B obj1 = new B();
        objB.meth();
        obj1.meth();
//        System.out.println(objB.meth());
//        System.out.println(obj1.meth());
    }
}

