package com.sample.generics;

public class MaxOfArray {
 
	public static void main(String args[])
	{
		Integer[] a={1,2,3,4,5};
		printmax(a);
		String[] g={"a","b","c","d"};
		printmax(g);
		Double[] d={1.0,2.0,3.0,4.0};
		printmax(d);
		
		Student a1 = new Student();
		a1.setValue(10);
		a1.setName("a1");
		
		Student a2 = new Student();
		a2.setValue(20);
		a2.setName("a2");
	
		Student a3 = new Student();
		a3.setValue(50);
		a3.setName("a3");
		
		Student[] as = {a1,a2,a3};
		printmax(as);
		
	}	

	private static <T extends Comparable<T>> void printmax(T[] array) {
		// TODO Auto-generated method stub
		   T temp=array[0];
		  for(int i=0;i<array.length;i++)
		  {
			 if(temp.compareTo(array[i]) < 0){
					 temp = array[i];
			 } 
		  }
		  
		  System.out.println(temp);
	}
	
}
