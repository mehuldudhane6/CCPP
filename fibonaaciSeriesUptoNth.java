package com.cdac;

import java.util.Scanner;

public class fibonaaciSeriesUptoNth {
     
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range");
		int n=sc.nextInt();
		int c=0;
		int a=0,b=1;
		while(c<=n)
		{
			System.out.print(c+"+");
            c=a+b;
            a=b;
            b=c;
		}
	}
}
