package com.algo.sorting;

public class InsertionSort {

    public static void main(String[] args){
        System.out.println("Selection Sort Algorithm");
        int[] arr = {10,23,1,3,5,2,5,0};
        int n = arr.length;

        System.out.println("original Array :: ");
        printArray(arr);

        System.out.println("\n After selection sort Array :: ");
        insertionSort(arr,n);
        printArray(arr);


    }

    private static void printArray(int[] arr){
        for(int i : arr)
            System.out.print(i + " ");
    }

    public static void insertionSort(int[] arr, int len){
        for(int i = 1; i < len ; i++){
            int midIndex = i;
            int midValue = arr[i];
            /*
                to sort this array in reverse by using insertion sorting algo
                we need to change below while condition arr[midIndex-1] > midValue
                as below midValue > arr[midIndex-1]
             */

            while(midIndex > 0 && arr[midIndex-1] > midValue){
                arr[midIndex] = arr[midIndex-1];
                midIndex = midIndex -1;
            }
            arr[midIndex] = midValue;
        }
    }
}
