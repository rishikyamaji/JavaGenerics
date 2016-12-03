package com.sample.generics;

public class Student implements Comparable<Student>{
	int marks;
	String name;

	public int getValue() {
		return this.marks;
	}

	public void setValue(int value) {
		this.marks = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {
	    if(this.marks > o.getValue())
	    	return 1;
	    else if(this.marks < o.getValue())
	    	return -1;
		return 0;
	}
	
	public String toString(){
		return this.name;
	}
}
