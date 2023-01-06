package org.example;

public class MethodsDemo {
    public static void main(String[] args) {

        MethodsDemo d = new MethodsDemo();
        String name = d.getData();
        System.out.println(name);

        MethodsDemo2 d1 = new MethodsDemo2();
        d1.getUserData();

        }

     //Method used offside
    public String getData()
    {
        System.out.println("Hello World");
        return "Yael Muzquiz";
    }


}
