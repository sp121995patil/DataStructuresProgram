package com.algo.search;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Array size :: ");
        int len = scanner.nextInt();
        int[] arr = new int[len];

        for(int index = 0; index < len ; index++){
            System.out.print("Enter element ");
            arr[index] = scanner.nextInt();
        }

        System.out.println();
        sortArray(arr, arr.length);

        for(int value : arr)
            System.out.print(value + " ");
    }

    /**
     * @param arr
     * @param len
     */
    private static void sortArray(int[] arr, int len){
        int temp = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}
