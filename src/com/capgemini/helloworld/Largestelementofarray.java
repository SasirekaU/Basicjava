package com.capgemini.helloworld;

public class Largestelementofarray {
public static void main(String args[])
{
	int a[]= {2,3,67,12345};
	int size=a.length;
	int temp;
	for(int i=0;i<size;i++)
	{
		for(int j=i+1;j<size;j++)
		{
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.println("largest element is :" +a[size-1]);
}
}
