package com.arrays.example;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementToIndex {
    public static void main(String[] var){
        Scanner scanner = new Scanner(System.in);
        int length = 0;
        int input[];
        int output[];
        int atIndex, value;

        System.out.println("Enter the length of Array :: - ");
        length = scanner.nextInt();
        input = new int[length];

        for(int index=0 ; index < length ; index++){
            System.out.print("Enter element at "+index+" index :- ");
            input[index] = scanner.nextInt();
            System.out.println();
        }

        System.out.println("Array : "+ Arrays.toString(input));

        /*System.out.println("on which index u want to add element :: ");
        atIndex = scanner.nextInt()-1;
        output = new int[length+1];
        System.out.println("What value u want to add  :: ");
        value = scanner.nextInt();

        for(int index  = 0 ; index <= length; index++){
            if(index < atIndex){
                output[index]= input[index];
            }else if(index == atIndex){
                output[index] = value;
            }else{
                output[index]= input[index-1];
            }
        }

        System.out.println("New Array[] "+Arrays.toString(output));*/

        System.out.println("=========================================================================================");
        int n = input.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++) {
                System.out.println(input[j]+ " < "+input[min_idx]);
                if (input[j] < input[min_idx]) {
                    min_idx = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = input[min_idx];
            input[min_idx] = input[i];
            input[i] = temp;
        }
        System.out.println("Selection Sort :: "+Arrays.toString(input));
    }
}
