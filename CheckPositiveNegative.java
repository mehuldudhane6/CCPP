package com.cdac;

import java.util.Scanner;

public class CheckPositiveNegative {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		String result=(num>0)?"positive":"negative";
		System.out.println("given number is" +result);
		

	}

}
