package com.driver;

public class A {
    String meth() {
        return "Invoking method from class A";
    }
}

public class B extends A {
    @Override
    String meth() {
        return "Method is overridden in Extended class B";
    }
}

public class Main {
    public static void main(String[] args) {
        // Task 3
        B objB = new B();
        String resultTask3 = objB.meth(); // Calling method meth of class A with object of class B
        System.out.println("Task 3 Result: " + resultTask3);

        // Task 5
        String resultTask5 = objB.meth(); // Calling overridden method from object of class B
        System.out.println("Task 5 Result: " + resultTask5);
    }
}

