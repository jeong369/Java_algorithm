package com.ktds.step05.bruteforce;

import java.util.Arrays;

public class PermutationTest {
	// 순열
	
	static int[] numbers = {1,2,3};
	static int[] p;
	static boolean[] isSelected;
	static int N = numbers.length;
	static int R = 2; // 가변적
	
	public static void main(String[] args) {
		p = new int[R] ; // 이미 뽑은 수의 배열
		isSelected = new boolean[N]; // 뽑혔는지의 여부 - 순서는 모름
		
		permutation(0);
	}
	
	public static void permutation(int cnt) {
		// 재귀함수
		// 해당 자리(cnt)에 가능한 수 뽑아보는 함수
		
		if (cnt == R) { //  순열 완성
			System.out.println(Arrays.toString(p));
			return;
		};
		
		for (int i=0; i<N; i++) { // 가능한 모든 수에 대해 시도
			if (isSelected[i]) continue; // 이미 사용중이면 pass - 없으면 중복순열
			
			p[cnt] = numbers[i]; // 뽑음
			isSelected[i] = true; // 뽑았다고 체크
			
			permutation(cnt+1);
			isSelected[i] = false; // 앞의 자리로 되돌아왔을때 다시 사용할 수 있도록 체크 해제 
		}
	}
	

}
