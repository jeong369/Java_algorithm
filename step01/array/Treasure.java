package com.ktds.step01.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

// 1026 보물

public class Treasure {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 1. 버퍼
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// 2. input 받기
		int N = Integer.parseInt(in.readLine());
		int[] A = new int[N];
		StringTokenizer st = new StringTokenizer(in.readLine(), " ");
		for (int i=0; i<N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		Integer [] B = new Integer[N];
		st = new StringTokenizer(in.readLine(), " ");
		for (int i=0; i<N; i++) {
			B[i] = Integer.parseInt(st.nextToken());
		}
		
		// 3. 정렬
		Arrays.sort(A);
		Arrays.sort(B, Collections.reverseOrder());
		
//		System.out.println(Arrays.toString(A));
//		System.out.println(Arrays.toString(B));
		
		int sum = 0;
		for (int i=0; i<N; i++) {
			sum += A[i]*B[i];
		}
		
		System.out.println(sum);
	}

}
