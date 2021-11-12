package com.arrays.example;

import java.util.Scanner;

/**
 *  this array program is totally static.
 *  array size is fixed.
 *  element for this 2D array will be taken from user end by command line
 *
* */

public class Creating2DArray {

    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);

        int[][] twoDArr = new int[2][2];

        for(int row=0 ; row < 2 ; row++){
            for(int col=0 ; col < 2 ; col++){
                System.out.print("Enter element  : ");
                twoDArr[row][col] = scanner.nextInt();
            }
        }

        for(int row=0 ; row < 2 ; row++){
            for(int col=0 ; col < 2 ; col++){
                System.out.print(twoDArr[row][col]+" ");
            }
            System.out.print("\n");
        }


    }

}
