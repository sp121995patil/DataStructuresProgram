package com.arrays.basic;

import java.util.Scanner;

public class ReverseArray{
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int size = 0;
		
		System.out.print("Enter Array size :: ");
		size = scanner.nextInt();
		
		int[] array = new int[size];
		System.out.println();
		
		for(int index =0 ; index < size; index++){
			System.out.print("Enter Element ");
			array[index] = scanner.nextInt();
		}
		
		for(int i = (size-1) ; i >= 0; i--)
			System.out.print(array[i] + " ");
		
		//reverse(array, (array.length-1));
		//printArray(array, array.length);
		
	}
	
	private static void reverse(int[] arr, int size){
		int offset = 0;
		int temp;
		while(offset < size){
			temp = arr[offset];
			arr[offset] = arr[size];
			arr[size] = temp;
			offset++;
			size--;
		}
	}
	
	private static void printArray(int[] array, int size){
		for(int index=0; index < size; index++)
			System.out.print(array[index] + " ");
		
		System.out.println();
	}
	
}