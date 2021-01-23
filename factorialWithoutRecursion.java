package com.cdac;

import java.util.Scanner;

public class factorialWithoutRecursion {
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int result=1;
		for(int i=1;i<=5;i++)
		{
			result=result*i;
		}
		
      System.out.println("factorialof number="+result);
	}
}
