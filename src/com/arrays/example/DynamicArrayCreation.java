package com.arrays.example;

import java.util.Scanner;

public class DynamicArrayCreation {

    public static void main(String[] arg){
        Scanner scanner = null;
        int row = 0, col=0;
        int[][] dynaminArray = null;

        scanner = new Scanner(System.in);

        System.out.print(" Please Enter number of row :: ");
        row = scanner.nextInt();

        System.out.print(" Please Enter number of col :: ");
        col = scanner.nextInt();

        System.out.print("Please Enter element for "+row+" * "+col+" \n");

        dynaminArray = new int[row][col];

        /*
            below code is for getting input in array
         */
        for(int rowIndex = 0 ; rowIndex < row; rowIndex++){
            for(int colIndex = 0 ; colIndex < row; colIndex++){
                System.out.print("enter element : ");
                dynaminArray[rowIndex][colIndex] = scanner.nextInt();
            }
        }

        /*
            below code is for getting printing element of array
         */
        for(int rowIndex = 0 ; rowIndex < row; rowIndex++){
            for(int colIndex = 0 ; colIndex < row; colIndex++){
                System.out.print(" "+dynaminArray[rowIndex][colIndex]);
            }
            System.out.print("\n");
        }


    }

}
