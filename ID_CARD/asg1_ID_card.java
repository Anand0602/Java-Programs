package com.internshala.javaapp;

import java.util.Scanner;

public class asg1_ID_card {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your blood group: ");
        String bloodGroup = scanner.nextLine();

        String group;
        if (age >= 20) {
            group = "RED";
        } else if (age >= 15 && age < 20) {
            group = "BLUE";
        } else if (age >= 10 && age < 15) {
            group = "YELLOW";
        } else {
            group = "INVALID AGE";
        }
        System.out.println("---------------------------");
        System.out.println("\tName: " + name);
        System.out.println("\tAge: " + age);
        System.out.println("\tBlood Group: " + bloodGroup);
        System.out.println("---------------------------");
        System.out.println("\t Your Group is " + group);
        System.out.println("---------------------------");
    }
}


