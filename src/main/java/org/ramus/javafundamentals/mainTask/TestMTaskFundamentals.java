package org.ramus.javafundamentals.mainTask;

import java.util.Scanner;

public class TestMTaskFundamentals {
    public static void main(String[] args) {
        MTaskFundamentals mainTask = new MTaskFundamentals();
        Scanner input = new Scanner(System.in);
        String month;


//        System.out.println("What is your name?");
//        String userName = input.nextLine();
//        mainTask.greeting(userName);
//        mainTask.revert(userName);
//
//        System.out.println("Input required quantity of numbers: ");
//        int quality = input.nextInt();
//        mainTask.workingWithNumbers(quality);
//
//        System.out.println(" Sum of which numbers you want to know ");
//        int numForSum = input.nextInt();
//        mainTask.summingNumbers(numForSum);

        System.out.println("What month number is ? ");
        int monthNumber = input.nextInt();
        month = mainTask.whatIsMonthIs(monthNumber);
        System.out.println("Your month is "+ month);

    }
}
