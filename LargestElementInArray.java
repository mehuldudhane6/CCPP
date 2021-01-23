package com.cdac;

public class LargestElementInArray {

	public static void main(String[] args) {
		int arr[]= {10,45,2,19,10};
        int max=arr[0];;
		for(int i=0;i<arr.length;i++)
		{
	
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		
		System.out.println("maximum elemnt="+max);
	}

}
