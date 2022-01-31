package com.capgemini.helloworld;

public class Mynestedif {
public static void main(String args[])
{
	int b=-10;
	if(b>0)
	{
		if(b%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
		
	}
	else {
		System.out.println("enter positive number");
	}
}
}
