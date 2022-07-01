package com.ktds.step05.bruteforce;

import java.util.Arrays;

public class PowerSetTest {
	// 부분집합
	
	static int[] numbers = {1,2,3};
	static boolean[] isSelected;
	static int N = numbers.length;
	
	public static void main(String[] args) {
		isSelected = new boolean[N]; // 뽑혔는지의 여부 - 순서는 모름
		powerSet(0);
	}
	
	public static void powerSet(int idx) {
		// 해당 수를 부분집합의 구성에 넣을지 고려해보기
		// idx : 해당 수의 index
		
		if (idx == N) { // 부분집합 완성
			for (int i=0; i<N; i++) {
				System.out.print((isSelected[i]?numbers[i]:"X")+"\t");
			}
			System.out.println();
			return;
		};
		
		// 부분집합 구성에 포함
		isSelected[idx] = true;
		powerSet(idx+1);
		// 부분집합 구성에 미포함
		isSelected[idx] = false;
		powerSet(idx+1);
	}
	

}
