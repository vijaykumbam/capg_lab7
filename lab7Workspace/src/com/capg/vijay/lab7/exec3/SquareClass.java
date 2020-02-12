package com.capg.vijay.lab7.exec3;

import java.util.HashMap;
import java.util.Map;

public class SquareClass 
{
	static HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
	public static Map getSquare(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			hm.put(i,arr[i]*arr[i]);
		}
		return hm;
		
	}
}
