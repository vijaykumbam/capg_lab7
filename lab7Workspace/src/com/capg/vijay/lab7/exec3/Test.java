package com.capg.vijay.lab7.exec3;

import java.util.Scanner;

public class Test 
{

	public static void main(String[] args)
	{
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		int arrSize = sc.nextInt();
		int[] arr = new int[arrSize];
		for(int loop=0;loop<arrSize;loop++)
		{
			arr[loop] = sc.nextInt();
		}
		
		SquareClass obj = new SquareClass();
		System.out.println(obj.getSquare(arr));
		sc.close();
	}

}
