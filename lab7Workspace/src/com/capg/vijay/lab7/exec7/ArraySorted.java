package com.capg.vijay.lab7.exec7;

import java.util.Arrays;

public class ArraySorted
{

	public int[] getSorted(int arr[])
	{
		StringBuffer sbarr[]=new StringBuffer[arr.length];
		 for(int loop=0;loop<arr.length;loop++)
		 {
			 sbarr[loop]=new StringBuffer(""+arr[loop]);
			sbarr[loop].reverse();
		 }
		 
		 
		 int arr3[]=new int[arr.length];
		 for(int loop1=0;loop1<arr.length;loop1++)
		 {
			arr3[loop1]=Integer.parseInt(sbarr[loop1].toString()); 
		 }
		 Arrays.sort(arr3);
		 return arr3;
	}
}