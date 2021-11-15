package com.arrays.example;

import java.util.Arrays;
import java.util.Scanner;


//sorting an array
public class SimpleArray {

    public static void main(String[] args){
        int arrLen = 0, temp = 0 , count = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter lenght of Array :: ");
        arrLen = scanner.nextInt();

        int[] arr = new int[arrLen];

        System.out.print("\n");

        for(int i = 0; i < arrLen; i++){
            System.out.print("Enter element :: ");
            arr[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        for(int i = 0; i < arrLen; i++){
            count++;
           for(int j = i+1 ; j < arrLen; j++){
               count++;
               if(arr[i] > arr[j]){
                   temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
               }
           }
           System.out.println("");
        }

        System.out.println(Arrays.toString(arr));

    }

}
