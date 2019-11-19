package com.erlich;

public class Main {

    public static void main(String[] args) {
        int[] a = {-1, 9, 3, 0, -3, 2, 4};
        System.out.print("array: ");
        printArr(a);
        System.out.println(" odd: " + numOdd(a));
        System.out.println("even: " + numEven(a));
        int[] indMinMax = getMinMaxInd(a);
        System.out.println("Index of min: " + indMinMax[0]);
        System.out.println("Index of max: " + indMinMax[1]);
        int[][] res = getOddEven(a);
        System.out.print(" odd elements: ");
        printArr(res[0]);
        System.out.print("even elements: ");
        printArr(res[1]);
    }
}
