package org.ramus.javafundamentals;

import java.util.Scanner;

public class OptionalTask2 {
    public static void main(String[] args) {
        int width = new Scanner(System.in).nextInt();
        int hight = new Scanner(System.in).nextInt();
        mean(matrixFilling(width, hight));
    }

    public static int[][] matrixFilling(int width, int hight) {
        int[][] array = new int[hight][width];
        for (int i = 0; i < hight; i++) {
            for (int j = 0; j < width; j++) {
                array[i][j] = 0 + (int) (Math.random() * 99);
            }
        }
        return array;
    }

    public static void mean(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            System.out.println((double) sum / matrix[i].length);
            sum = 0;
        }
    }
}
