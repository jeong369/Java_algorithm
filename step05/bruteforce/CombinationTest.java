package com.ktds.step05.bruteforce;

import java.util.Arrays;

public class CombinationTest {

	static int[] numbers = {1,2,3};
	static int[] c;
	static int N = numbers.length;
	static int R = 3; // 가변적
	
	public static void main(String[] args) {
		c = new int[R] ; // 이미 뽑은 수의 배열
		
		combination(0, 0);
	}
	
	public static void combination(int cnt, int start) {
		// 재귀함수
		// 해당 자리(cnt)에 가능한 수 뽑아보는 함수
		// 이미 앞에서 시도한 경우를 제외해야 하므로 start부터 시작(내 뒤에 것만 뽑음)
		
		if (cnt == R) { //  조합 완성
			System.out.println(Arrays.toString(c));
			return;
		};
		
		for (int i=start; i<N; i++) { // 가능한 시작위치부터 모든 수에 대해 시도
			c[cnt] = numbers[i]; // 뽑음
			combination(cnt+1, i+1); // 뽑은 자리의 다음 자리부터 뽑으라고 알려줌 start=i+1 // 중복조합은 지금 숫자도 뽑을 수 있으므로 start=i

		}
	}

}
