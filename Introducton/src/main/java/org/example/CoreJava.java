package org.example;

public class CoreJava {
    public static void main(String[] args) {

        int myNum = 5;
        String website = "Rahul Shetty Academy";
        char letter = 'r';
        double dec = 5.99;
        boolean myCard = true;

        System.out.println(myNum + " is the value in the myNum variable");
        System.out.println(website);

        //Arrays -
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        int[] arr2 = {1, 2, 3, 4, 5,6,7,8,9,10,122};

        /*for loop
        for (int i = 0; i <= arr.length; i++)
        {
            System.out.println(arr[i]);
        }*/

        for (int i = 0; i < arr2.length; i++)
        {
            System.out.println(arr2[i]);
        }

        String[] name = {"Yael","Muzquiz","Pluma"};

        for (int i = 0; i < name.length; i++)
        {
            System.out.println(name[i]);
        }

        for( String s: name)
        {
            System.out.println(s);
        }


    }
}