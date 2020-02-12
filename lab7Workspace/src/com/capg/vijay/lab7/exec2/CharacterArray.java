package com.capg.vijay.lab7.exec2;

import java.util.HashMap;
import java.util.Map;

public class CharacterArray 
{
	HashMap<Character,Integer>hm = new HashMap<Character,Integer>();
	public Map characterCount(char[] arr) 
	{
		for(int loop=0;loop<arr.length;loop++)
		{
			int count = 0;
			char finder = arr[loop];
			for(int loop1 = loop;loop1<arr.length;loop1++)
			{
				if(finder == arr[loop1])
				{
					count++;
					hm.put(arr[loop],count);
				}
			}
		}
		return hm;
	}
	
}
