package com.ktds.step02.sort;

public class Student implements Comparable<Student>{

	String name;
	int age;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Student o) {
		return this.age - o.age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	
}
