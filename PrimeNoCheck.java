package com.cdac;

import java.util.Scanner;

public class PrimeNoCheck {

	public static void main(String[] args) {
		
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           int count=0;
           for(int i=2;i<n/2;i++)
           {
        	   if(n%i==0)
        	   {
        		   count++;
        	   }
           }
           if(count==1)
           {
        	   System.out.println("not prime no");
           }
           else
           {
        	   System.out.println("prime no");
           }
	}

}
