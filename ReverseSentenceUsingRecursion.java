package com.cdac;

public class ReverseSentenceUsingRecursion {

	public static void main(String[] args) {
		  
		String s="mehul Welcome";
		String revString=reverse(s);
		System.out.println("reverse string="+revString);

	}
	
	//using recursion
	
	public static String reverse(String s)
	{
		if(s.isEmpty())
		{
			return s;
		}
		else
		{
			char ch=s.charAt(0);
			return reverse(s.substring(1))+ch;
		}
	}
	
	
//	using normal method
	
//	public static void reverse(String s)
//	{
//		int n=s.length();
//		for(int i=0;i<n;i++)
//		{
//			System.out.print(s.charAt(n-1-i));
//		}
//	}

}
