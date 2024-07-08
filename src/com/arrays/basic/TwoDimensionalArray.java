package com.arrays.basic;

import java.util.Scanner;
public class TwoDimensionalArray{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("ArrayExample : main(-) Start ");
		
		System.out.println("Enter the row size :: ");
		int row = scanner.nextInt();
		System.out.println("Enter the Col size :: ");
		int col = scanner.nextInt();
		
		int[][] array = new int[row][col];
		
		for(int index = 0 ; index < row ; index++){
			for(int value = 0 ; value < col; value++){
				System.out.println(" Enter element for col :: "+value);
				array[index][value] = scanner.nextInt();
			}
		}
		
		
		System.out.println("Printing Array ");
		
		for(int index = 0 ; index < row ; index++){
			for(int value = 0 ; value < col; value++){
				System.out.print(array[index][value] + " ");
			}
			System.out.println("");
		}
		
		
	}
}