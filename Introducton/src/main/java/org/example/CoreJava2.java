package org.example;

import jdk.dynalink.linker.LinkerServices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJava2 {
    public static void main(String[] args) {

        int[] arr2 = {1, 2, 3, 4, 5,6,7,8,9,10,122};

        //2,4,6,8,10,122

        //Check if array has multiple of 2

        for(int i=0;i<arr2.length;i++)
        {
            if(arr2[i] % 2 == 0)
            {
                System.out.println(arr2[i]);
                break;
            }
            else
            {
                System.out.println(arr2[i] + "Is not multiple of 2");
            }

        }
        System.out.println("***************");
        //create ofject of the clas - object.method
        ArrayList<String> a = new ArrayList<String>();
        a.add("Yael");
        a.add("Muzquiz");
        a.add("Pluma");
        a.add("Academy");
        a.add("Selenium");
        System.out.println(a.get(3));

        for (int i=0;i<a.size();i++)
        {
            System.out.println(a.get(i));
        }
        System.out.println("*****************");
        for (String val :a)
        {
            System.out.println(val);
        }

        System.out.println("******************");
        //item is present in Array list
        System.out.println(a.contains("Selenium"));

        String[] name = {"Yael","Muzquiz","Pluma"};
        List<String> nameArrayList = Arrays.asList(name);
        System.out.println(nameArrayList.contains("Selenium"));


    }

}
