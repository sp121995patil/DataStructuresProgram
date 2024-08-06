package com.algo.sorting;

public class SelectionSort {
    public static void main(String[] args){
        System.out.println("Selection Sort Algorithm");
        int[] arr = {10,23,1,3,5,2,5,0};
        int n = arr.length;

        System.out.println("original Array :: ");
        printArray(arr);

        System.out.println("\n After selection sort Array :: ");
        selectionSort(arr,n);
        printArray(arr);


    }

    private static void printArray(int[] arr){
        for(int i : arr)
            System.out.print(i + " ");
    }

    private static void selectionSort(int[] arr, int n){

        for(int i = 0; i < n-1; i++){
            int position = i;
            for(int j = i+1; j < n; j++){
                if(arr[j] < arr[position] ) {
                    System.out.println(arr[j] + " < " + arr[position] + " = " + (arr[j] < arr[position]));
                    position = j;
                }
                    int temp = arr[i];
                    arr[i] = arr[position];
                    arr[position] = temp;

            }
        }

    }
}
