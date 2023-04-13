package com.internshala.javaapp;

import java.util.Scanner;

public class asg_2 {
    public static  void main(String[] Args)
    {
        System.out.println("Tax Calculator App");
        System.out.println("----WELCOME----");
        Scanner sc = new Scanner(System.in);
        int n,i;
       //String [] names;
        System.out.println("Enter total person count:");
        n= sc.nextInt();
       // System.out.println(n);
        String [] names=new String[n];
        long [] income = new long[n];

        for (i=0;i<n;i++)
        {
            System.out.println("Enter the name " +(i+1) +":");
            names[i]=sc.next();

            System.out.println("Enter "+names[i]+"'s Annual Income: "+(i+1) +":");
            income[i]=sc.nextLong();
        }
        System.out.println("Names with liable Taxes ");
        System.out.println("---------------------");
        for( i =0; i< n;i++)
        {
            calculateTax(names[i], income[i]);
        }


        sc.close();
    }
    public static void calculateTax(String nm, double in)
    {
        char sgn= '\u20B9';
        double tax=0.0;
        if (in >= 300000)
        {
            tax=0.2*in;
        } else if (in >=100000)
        {
            tax=0.1*in;

        }
        else {
            tax=0;
            return;
        }

        System.out.println(nm+" :  "+sgn+ tax);
    }

    }
