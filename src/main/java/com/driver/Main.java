package com.driver;

public class Main {
    public static void main(String[]args){
        A obj = new A();
        System.out.println(obj.meth());
        A obj1 = new B();
        System.out.println(obj1.meth());
    }
}
class A{
    public String meth(){
        return "Invoking method from class A";
    }
}
class B extends A{
    public String meth(){
        return "Method is overridden in Extendend class B";
    }
}
