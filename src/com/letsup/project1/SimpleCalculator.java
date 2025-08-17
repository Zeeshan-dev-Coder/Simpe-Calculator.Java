package com.letsup.project1;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number");
        int num1 = scanner.nextInt();
        System.out.println("Enter your second number");
        int num2 = scanner.nextInt();
        System.out.println("Enter\n+ for addition\n- for substraction" +
                "\n* for Multiplication\n/ for division");
        String input = scanner.next();
        switch (input){
            case "+": System.out.println("Addition: "+(num1+num2));
            break;
            case "-": System.out.println("Substraction: "+(num1+num2));
            break;
            case "*": System.out.println("Multiplication: "+(num1+num2));
            break;
            case "/": System.out.println("Division: "+(num1+num2));
            break;
            default:
                System.out.println("Incorrect Option selected");
        }
*/


        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Enter your first number");
            int num1 = scanner.nextInt();
            System.out.println("Enter your second number");
            int num2 = scanner.nextInt();
            System.out.println("Enter\n+ for addition\n- for substraction" +
                    "\n* for Multiplication\n/ for division");
            String input = scanner.next();
            switch (input){
                case "+": System.out.println("Addition: "+(num1+num2));
                    break;
                case "-": System.out.println("Substraction: "+(num1-num2));
                    break;
                case "*": System.out.println("Multiplication: "+(num1*num2));
                    break;
                case "/":
                    if(num2==0)
                        System.out.println("Cannot devided by zero");
                    else
                    System.out.println("Division: "+(num1/num2));
                    break;
                default:
                    System.out.println("Incorrect Option selected");
            }
            System.out.println("Enter Y to continue and N to exit");
            String op =scanner.next();
            if(op.equals("N") || op.equals("n"))
              /*  continue;
            else*/
                break;
        } while(true);

    }
}
