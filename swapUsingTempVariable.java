package com.cdac;

import java.util.Scanner;

public class swapUsingTempVariable {
	public static void main(String[] args) {
		int a=10,b=20;
		swap(a,b);
		

	}
	
	public  static void swap(int a,int b)
	{
		int temp=a;
		a=b;
		b=temp;
		System.out.println(a+" "+b);
	}
}
