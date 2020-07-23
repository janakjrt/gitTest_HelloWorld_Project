package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("hello world ! from github.com..");
        System.out.println("Janak Tripathee");
        //System.out.println("Java Automation\n");

        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MMM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        System.out.println(formatter.format(date));
        System.out.println("another test");

        /*
        //4/6/2020 2:20 pm
        int[] intArray={100,200,300};
        for (int a:intArray){
            System.out.println(a);
        }
        */
        //https://github.com/qalamsal/gitTest_HelloWorld_Project.git

        int a=10, b=20;
        int sum = a + b;
        System.out.println(sum);

    }

}
