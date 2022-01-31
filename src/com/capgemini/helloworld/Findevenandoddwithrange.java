package com.capgemini.helloworld;

public class Findevenandoddwithrange {
//need to find even and odd between 1 to 100
	public static void main(String args[])
	{
		for(int i=1;i<=20;i++)
		{
			if(i==10)
			{
				continue;
			}
		    if(i%2==0)
		    {
		    	System.out.println("even " +i);
		    }
		    else
		    {
		    	System.out.println("odd" +i);
		    }
		    
		}
	}
}
