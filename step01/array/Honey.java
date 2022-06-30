package com.ktds.step01.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 12847번 꿀 아르바이트
// n+1후에 월세를 내야 함
// 최대 m일 일할 수 있다
// 매일 급여가 다르다
// 연속되게 일해야 한다

// sliding window 방법
// n일 -> m일만 일하면 
// -> sum = int[n-m+1]
// -> sum[i] = arr[i-m+1]+arr[i-m+2]+..+arr[i-1] (m개)
// -> sum[i+1] = sum[i] - arr[i-m] + arr[i] 

public class Honey {

	public static void main(String[] args) throws IOException {
		
		// 1. 버퍼 읽기
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// 2. input 받기
		StringTokenizer st = new StringTokenizer(in.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		// 3. 입금순서 받기
		int[] t = new int[n];
		st = new StringTokenizer(in.readLine(), " ");
		for (int i=0; i<n; i++) {
			t[i] = Integer.parseInt(st.nextToken());
		}
		
		// 4. sliding window 처리
		// int로는 다 안담겨서 long으로 해야 함....!
		long maxValue = 0;
		long sum = 0;
		for (int j=0; j<n; j++) {
			if (j<m) { 
				sum += t[j];
			}
			else { // 0(j-m) 1 2 -> 1 2 3(j=3)
				sum += t[j] - t[j-m]; 
			}
			if (sum >= maxValue) {
				maxValue = sum;
			}
		}
		
		System.out.println(maxValue);
		
		
		
	}

}
