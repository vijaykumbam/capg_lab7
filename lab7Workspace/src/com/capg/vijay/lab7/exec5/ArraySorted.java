package com.capg.vijay.lab7.exec5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArraySorted 
{
	int arr[];
	ArraySorted(int size)
	{
		arr = new int [size];
		for(int loop=0;loop<size;loop++)
		{
			Scanner sc = new Scanner(System.in);
			arr[loop] = sc.nextInt();
		}
		for(int loop1=0;loop1<size;loop1++)
		{
			System.out.println(arr[loop1]);
		}
		getSecondSmallest(arr);
	}
	
	int getSecondSmallest(int arr[])
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)      
			al.add(arr[i]);
			Collections.sort(al);
			Object [] obj=al.toArray();
			int a = (int)obj[1];
			System.out.println(a);
	
		return a;
	}
	
}
