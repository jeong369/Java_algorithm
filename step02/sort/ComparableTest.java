package com.ktds.step02.sort;

import java.util.Arrays;
import java.util.Comparator;

public class ComparableTest {

	public static void main(String[] args) {
	
		Student[] students = {
				new Student("아이유", 30),
				new Student("공유", 48),
				new Student("정국", 18),
		};
		
		System.out.println(Arrays.toString(students));
//		Arrays.sort(students);
		Arrays.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// return o1.name.compareTo(o2.name);
				return -(o1.age - o2.age);
			}
		});
		System.out.println(Arrays.toString(students));
		
	}

}
