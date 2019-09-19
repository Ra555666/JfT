package org.ramus.javafundamentals;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class OptionalTask1_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temp;

        System.out.println("How much number do you want input?");

        int numbers = input.nextInt();

        int[] userNumbers = new int[numbers];

        System.out.println("Input your numbers");

        for (int i = 0; i < numbers; i++){
            userNumbers[i] = input.nextInt();
        }

//        System.out.println(Arrays.toString(userNumbers));

        for (int i = 1; i < userNumbers.length; i++){
            for (int j = i; j > 0; j--){
                if (userNumbers[j] < userNumbers[j - 1]){
                    temp = userNumbers[j];
                    userNumbers[j] = userNumbers[j - 1];
                    userNumbers[j - 1] = temp;
                }
            }
        }
        for (int i = 0; i < userNumbers.length; i++){
            System.out.println(userNumbers[i]);
        }
        System.out.println("short number is");
        System.out.println(userNumbers[0]);
        System.out.println("it length is");
        System.out.println(Integer.toString(userNumbers[0]).length());

        System.out.println("largest number is");
        System.out.println(userNumbers[userNumbers.length-1]);
        System.out.println("it length is");
        System.out.println(Integer.toString(userNumbers[userNumbers.length-1]).length());
    }
}
