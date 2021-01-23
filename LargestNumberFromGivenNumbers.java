package com.cdac;

import java.util.Scanner;

public class LargestNumberFromGivenNumbers {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the all the number");
		int arr[]=new int[5];
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		 
          System.out.println("largest number="+arr[0]);
	}

}
