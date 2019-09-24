package org.ramus.javafundamentals;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class OptionalTask1_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temp;
        int average;

        System.out.println("How much number do you want input?");

        int numbers = input.nextInt();

        int[] userNumbers = new int[numbers];

        System.out.println("Input your numbers");

        //filling array by numbers
        for (int i = 0; i < numbers; i++){
            userNumbers[i] = input.nextInt();
        }


        //sort numbers in array
        for (int i = 1; i < userNumbers.length; i++){
            for (int j = i; j > 0; j--){
                if (userNumbers[j] < userNumbers[j - 1]){
                    temp = userNumbers[j];
                    userNumbers[j] = userNumbers[j - 1];
                    userNumbers[j - 1] = temp;
                }
            }
        }

        //output numbers by length from min to max
        for (int i = 0; i < userNumbers.length; i++){
            System.out.println(userNumbers[i]);
        }

        //output numbers by length from max to min
        for(int i = userNumbers.length - 1; i>=0; i--){
            System.out.println(userNumbers[i]);
        }


        //output shortest number from array
        System.out.println("short number is");
        System.out.println(userNumbers[0]);
        System.out.println("it length is");
        System.out.println(Integer.toString(userNumbers[0]).length());

        //output longest number from array
        System.out.println("largest number is");
        System.out.println(userNumbers[userNumbers.length-1]);
        System.out.println("it length is");
        System.out.println(Integer.toString(userNumbers[userNumbers.length-1]).length());


    }
}
