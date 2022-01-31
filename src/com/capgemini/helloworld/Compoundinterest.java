package com.capgemini.helloworld;

public class Compoundinterest {
	public static void main(String args[]){
	      double princ = 456000, rt = 9.75, tm = 7;
	      double comp_int = princ *(Math.pow((1 + rt / 100), tm));
	      System.out.println(comp_int);
}
}
