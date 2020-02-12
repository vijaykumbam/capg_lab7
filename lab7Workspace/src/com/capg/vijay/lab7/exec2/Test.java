package com.capg.vijay.lab7.exec2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args)
	{
		System.out.println("Enter the size of character array");
		Scanner sc = new Scanner(System.in);
		int size  = sc.nextInt();
		char[] arr = new char[size];
		for(int loop=0;loop<size;loop++)
		{
			arr[loop] =sc.next().charAt(0);
		}
		CharacterArray obj = new CharacterArray();
		System.out.println(obj.characterCount(arr));
	}

}
