package com.ktds.step02.sort;

import java.util.Arrays;
import java.util.Collections;

public class SortTest {

	public static void main(String[] args) {
		
//		int[] arr = {4,7,1,3,9};
//		System.out.println(Arrays.toString(arr));
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		
		Integer[] arr = {new Integer(4),7,1,3,9};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
		 
		String[] arr2 = {"아이유", "인", "하마", "감자"}; // 자음으로 정렬
		System.out.println(Arrays.toString(arr2));
		Arrays.sort(arr2, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr2));
		
		// compareTo(T o); 비교결과 리턴 : > < =
		// equals; boolean 리턴 : T/F
		

	}

}
