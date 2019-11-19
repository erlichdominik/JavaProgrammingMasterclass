package com.erlich;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Create a program using arrays that sorts a list of integers in descending order.
        // Descending order is highest value to lowest.
        // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
        // ultimately have an array with 106,81,26, 15, 5 in it.
        // Set up the program so that the numbers to sort are read in from the keyboard.
        // Implement the following methods - getIntegers, printArray, and sortIntegers
        // getIntegers returns an array of entered integers from keyboard
        // printArray prints out the contents of the array
        // and sortIntegers should sort the array and return a new array containing the sorted numbers
        // you will have to figure out how to copy the array elements from the passed array into a new
        // array and sort them and return the new sorted array.
        int[] arr = {106,26,81,5,15};
//        for (int i: arr) {
//            System.out.println(i);
//        }
        arr = sortDescending(arr);
        for (int i :
                arr) {
            System.out.println(i);
        }
    }
    public static int[] sortDescending(int[] arr) {
        int tmp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] < arr[i + 1]) {
                tmp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = tmp;
            }
        }
        return arr;
    }
}
