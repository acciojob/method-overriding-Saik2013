package com.driver;

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
public class Main {
    public static void main(String[]args){
        A obj = new A();
        //calling a method
        String resTask3 = obj.meth();
        System.out.println("task 3 result: "+ resTask3);
        //polymorphism
        A obj1 = new B();
        //callin a method in B class
        String resTask5 = obj1.meth();
        System.out.println("task 5 result: "+ resTask5);
    }
}

