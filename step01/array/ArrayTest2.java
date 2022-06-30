package com.ktds.step01.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ArrayTest2 {

	public static void main(String[] args) throws NumberFormatException, IOException {	
		
		// 2차원 배열 array of array
		// 시험횟수(3)
		// 국 영 수
		// 국 영 수
		// 국 영 수
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		
		int[][] arr2 = new int[N][3]; // 점수2개 과목3개국영수
		
		for (int i=0; i<arr2.length; i++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " "); // 한줄 읽어서
			for (int j=0; j<3; j++) {
				arr2[i][j] = Integer.parseInt(st.nextToken()); // 하나씩 넣기			
			}
		}
		
		System.out.println(Arrays.deepToString(arr2)); // 확인용

	}

}
