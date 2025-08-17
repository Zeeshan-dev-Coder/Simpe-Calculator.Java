package com.letsup.project1;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String username = scanner.next();
        System.out.println("Enter Your age");
        int age = scanner.nextInt();

        System.out.println("Welcome to LetsUpgrade");
        System.out.println("************************************************");
        System.out.println("Your name: "+username);
        System.out.println("Your age: "+age);

        if (age>=18){
            System.out.println("you are eligible for Vote");
        }
        else {
            System.out.println("You are not eligible");
            System.out.println("Come for vote after "+ (18-age)+" Years");
        }
    }
}
