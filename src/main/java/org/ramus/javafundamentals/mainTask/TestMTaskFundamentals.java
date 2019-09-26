package org.ramus.javafundamentals.mainTask;

import java.util.Scanner;

public class TestMTaskFundamentals {
    public static void main(String[] args) {
        MTaskFundamentals mainTask = new MTaskFundamentals();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String userName = input.nextLine();
        mainTask.greeting(userName);

        mainTask.revert(userName);
    }
}
