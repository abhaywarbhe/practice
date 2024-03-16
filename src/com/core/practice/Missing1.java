package com.core.practice;

public class Missing1 {

	public static void main(String[] args) {
	
	int array[]= {1,5,3,6,2,4,10,8,7,9,10,};
	int len=array.length;
	
	int secondHighest=Integer.MIN_VALUE;
	int highest=Integer.MIN_VALUE;
	
	for(int i=0; i<len; i++)
	{
		if(array[i]>highest)
		{
			secondHighest=highest;
			highest=array[i];
		}
		
		if(array[i]<highest && array[i]>secondHighest)
		{
			secondHighest=highest;
		}
	}
	
	System.out.println(secondHighest);
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	}


