package com.capg.vijay.lab7.exec7;

import java.util.Scanner;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Size of Array:");
        int size=scan.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter Array Elements:");
          for(int index=0;index<size;index++)
          {
        	 arr[index]=scan.nextInt(); //elements are inserted.{65,48,74,98,87}-> {56,84,47,89,87}->47,56,84,87,89
          }
          
          //
          ArraySorted obj=new ArraySorted();
           int output[]=obj.getSorted(arr);
           for(int i=0;i<output.length;i++)
        	   System.out.println(output[i]);
         scan.close();
	}

}