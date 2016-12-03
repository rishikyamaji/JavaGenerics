package com.sample.generics;

public class PrintArray {
	
	
public static void main(String args[])
{
	Integer[] a={1,2,3,4,5};
	printArray(a);
	
	String[] s={"s","t","r"};
	printArray(s);
	
	Double[] d={1.0, 2.0, 3.0, 4.0};
	printArray(d);
	
}

     public static <T> void printArray(T[] array) {
	// TODO Auto-generated method stub
    	 for(int i=0;i<array.length;i++)
    	 {
    		 System.out.println(array[i]);
    	 }
    	 
}
	
	
}
