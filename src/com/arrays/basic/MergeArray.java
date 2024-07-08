package com.arrays.basic;

import java.util.Scanner;

public class MergeArray{
	public static void main(String[] arg){
		Scanner scanner = new Scanner(System.in);
		int firstLen = 0, secondLen = 0;
		
		System.out.println();
		
		System.out.print("1st Enter size of array :: ");
		firstLen = scanner.nextInt();
		
		System.out.print("2nd Enter size of array :: ");
		secondLen = scanner.nextInt();
		
		int[] firstArr = new int[firstLen];
		int[] secArr = new int[secondLen];
		
		for(int index = 0 ; index < firstLen ; index++){
			System.out.print("Enter 1st Array Element ");
			firstArr[index] = scanner.nextInt();
		}

		for(int index = 0 ; index < secondLen ; index++){
			System.out.print("Enter 2nd Array Element ");
			secArr[index] = scanner.nextInt();
		}
		
		int thirdLen = firstLen + secondLen;
		int[] thirdArr = new int[thirdLen];
		
		for(int index = 0 ; index < firstLen ; index++){
			thirdArr[index] = firstArr[index];
		}
		
		for(int index = 0 ; index < secondLen ; index++){
			thirdArr[firstLen + index] = secArr[index];
		}
		
		System.out.println("Merged Array as Result :: ");
		
		for(int index = 0 ; index < thirdLen ; index++){
			System.out.print(thirdArr[index]+ " ");
		}
		
	}
}