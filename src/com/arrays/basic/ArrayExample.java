package com.arrays.basic;

import java.util.Scanner;

public class ArrayExample{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("ArrayExample : main(-) Start ");
		
		System.out.print("Enter the size of Array : ");
		int size = scanner.nextInt();
		
		int[] array = new int[size];
		
		for(int index = 0 ; index < size ; index++){
			System.out.print("Enter the element ");
			array[index] = scanner.nextInt();
		}
		
		for(int index = 0 ; index < size ; index++){
			System.out.println("the element :: "+array[index]);
		}
		
		System.out.println("ArrayExample : main(-) End ");
	}

}