package com.erlich;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Insert number: ");
        int counter;
        counter = scanner.nextInt();
        int[] arr = new int[counter];
        arr = readIntegers(counter);
        System.out.println(Arrays.toString(arr));
        System.out.println("Min: " + findMin(arr));
    }

    private static int[] readIntegers(int number) {
        int[] arr = new int[number];

        for (int i = 0; i < number; i++) {
            System.out.println("Insert " + (int)(i+1) +" number");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    private static int findMin(int[] arr) {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
