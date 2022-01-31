package com.capgemini.helloworld;
import java.util.Scanner;
public class Maxofthreenumbers {
	public static void main(String args[])
	{
		int p,q,r;
		int max=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter p value:");
	    p=sc.nextInt();
	    System.out.println("enter q value:");
	    q=sc.nextInt();
	    System.out.println("enter r value:");
	    r=sc.nextInt();
	    if(p>q)
	    {
	    	if(p>r)
	    	{
	    		max=p;
	    	}
	    	else
	    	{
	    		max=r;
	    	}
	    }
	    else
	    {
	    	if(q>r)
	    	{
	    		max=q;
	    	}
	    	else
	    	{
	    		max=r;
	    	}
	    }
	    System.out.println("\n max value = " +max);
	    
	}

}
