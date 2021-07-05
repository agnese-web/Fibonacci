package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


        // Create scanner for user input
        Scanner scanner = new Scanner(System.in);


        int num1 = 1;
        int num2 = 1;
        int userNumber = 0;
        int numberPosition;
        int counter = 0;

        System.out.print("Which Fibonacci number do You want to see? ");
        numberPosition = scanner.nextInt();
        
        if (numberPosition == 1) {
            userNumber = num1;
        } else if (numberPosition == 2) {
            userNumber = num2;
        } else {
            counter = 3;
        }
        while (counter <= numberPosition) {
            userNumber = num1 + num2;
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            counter++;
        }
        System.out.println("You searched Fibonacci number " + numberPosition + " and it is " + userNumber);

                   // Another idea, how will it access the index and find number?
        // initializing variables
//
//        int num1 = 1;
//        int num2 = 1;

        // How many numbers will there be in sequence
//        System.out.print("Which Fibonacci number do You want to see? ");
//        int[] numberPosition = new int[scanner.nextInt()];

//        for (int i = 1; i <= howMany.length; ++i) {
//            System.out.print(num1 + " ");
//            int num3 = num2 + num1;
//            num1 = num2;
//            num2 = num3;
//        }


    }
}
