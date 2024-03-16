package com.core.practice;

public class LogicDemo {

	public static void main(String[] args) {

	int no[]= {35,55,99,74,66,75,99};
	int len=no.length;
	
	int secondHighest=Integer.MIN_VALUE;
	int highest=Integer.MIN_VALUE;
	
	for(int i=0; i<len; i++)
	{
		if(no[i]>highest)
			{secondHighest=highest;
		highest=no[i];
			}
		if(no[i]<highest && no[i]>secondHighest)
			{secondHighest=no[i];
			}
	}
		System.out.println(secondHighest);
	}

}
