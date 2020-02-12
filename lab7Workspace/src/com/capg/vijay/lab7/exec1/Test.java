package com.capg.vijay.lab7.exec1;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
public class Test 
{
	static List<String> la = new ArrayList<String>();
	public static void getMethod(String a)
	{
		la.add(a);
	}	
	
	public static void main(String[] args) 
	{
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1,"vijay");
		hm.put(20,"ajay");
		hm.put(2,"hemanth");
		hm.put(50,"nikhil");
		
		Collection<String> s=hm.values();
		for(String sa :s)
		{
			System.out.println(sa);
			getMethod(sa);
		}
		
		Collections.sort(la);
		System.out.println(la);
	}

}
