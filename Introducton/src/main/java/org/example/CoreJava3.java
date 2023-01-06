package org.example;

public class CoreJava3 {
    public static void main(String[] args) {

        //String is an Object / String Literal
        //String s = "Yael Fermin Muzquiz Pluma";

        //New
        String s2 = new String("Welcome");
        String s3 = new String("Welcome");

        String s1 = "Yael Fermin Muzquiz";
        String[] splittedString = s1.split("Fermin");
        System.out.println(splittedString[0]);
        System.out.println(splittedString[1]);
        System.out.println(splittedString[1].trim());

        /*for (int i = 0;i<s1.length();i++)
        {
            System.out.println(s1.charAt(i));
        }¨*/

        for (int i = s1.length()-1;i>=0;i--)
        {
            System.out.println(s1.charAt(i));
        }

    }
}
