package com.ktds.step01.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 2차원 배열의 구간합
// 구간합 구하기 : S[i][j] = S[i][j-1] + S[i-1][j] - S[i-1][j-1] + arr[i][j]
// 문제 답 구하기 : S = S[x2][y2]-S[x1-1][y2]-S[x2][y1-1]+S[x1-1][y1-1]
public class sumOfSection5 {

	public static void main(String[] args) throws IOException {
		
		// 1. 버퍼 in
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// 2. input N, M - 한줄 StringTokenizer
		StringTokenizer st = new StringTokenizer(in.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		// 3. N개의 줄에는 NxN 행렬 & 구간합 2차원 배열
		int[][] arr = new int[N+1][N+1];
		int[][] sum = new int[N+1][N+1]; // 입력수는<=1000
		
		for (int i=1; i<=N; i++) { // x
			st = new StringTokenizer(in.readLine(), " ");
			for (int j=1; j<=N; j++) { // y
				arr[i][j] = Integer.parseInt(st.nextToken());
				sum[i][j] = sum[i][j-1] + sum[i-1][j] - sum[i-1][j-1] + arr[i][j];
			}
		}
		
		// 4. M개의 줄에는 값 구해야 하는 좌표 x1, y1, x2, y2
		StringBuilder sb = new StringBuilder();
		for (int k=0; k<M; k++) {
			st = new StringTokenizer(in.readLine(), " ");
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			sb.append(sum[x2][y2]-sum[x1-1][y2]-sum[x2][y1-1]+sum[x1-1][y1-1]).append("\n");
		}
		
		System.out.println(sb.toString());
		
	}

}
