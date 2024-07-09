package com.arrays.example;

import java.util.Scanner;

public class ArraySubSetAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d=0,m=0;

        System.out.println("Enter the length of Array :: - ");
        int length = scanner.nextInt();
        int[] input = new int[length];

        for(int index=0 ; index < length ; index++){
            System.out.print("Enter element at "+index+" index :- ");
            input[index] = scanner.nextInt();
            System.out.println();
        }

        System.out.println("Enter value of D ");
        d = scanner.nextInt();

        System.out.println("Enter value of M ");
        m = scanner.nextInt();
        int count = 0 ;

        System.out.println("length :: "+length);

        for(int index=0 ; index < length ; index++){
            int sum = 0;
            if((index+m)<=length) {
                System.out.println("Index ="+ index+"  "+ ((index+m)<length));
                for (int i = index; i < (index+m); i++) {
                    sum = sum + input[i];
                    System.out.println("Sum :: " + sum);
                }
            }else{
                System.out.println("Index = "+ index+"  , M = "+m);
            }

            if(sum == d)
                count++;

        }

        System.out.println("count : "+count);

        /*for(int index=0 ; index < length ; index++)
            System.out.print(input[index] + " ");*/

    }

}
