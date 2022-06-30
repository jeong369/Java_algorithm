package com.ktds.step01.array;

// 11659번 구간 합 문제 4
// 수 N개가 주어졌을 때, i번째 수부터 j번째 수까지 합을 구하는 프로그램을 작성하시오
// 최악 O(N*M)

// **** 백준 제출 시 유의사항 ***
// package는 제외해야 함
// import 전부 넣어야 함
// class 이름을 Main으로 제출해야 함
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class sumOfSection {

	public static void main(String[] args) throws IOException {
		
		// 1. 버퍼 읽기
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// 2. input 읽기 - tab/개행문자 등으로 쪼개서 가져오기
		StringTokenizer st = new StringTokenizer(in.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
//		System.out.println(N);
//		System.out.println(M);
		
//		char[] ch = in.readLine().toCharArray();
		int[] ch = new int[N+1]; 
		
		// 3. 구간 합 저장 할 array 생성
		int[] sum = new int[N+1];
		
		// 4. 구간합 구하기
		st = new StringTokenizer(in.readLine(), " ");
		for (int i=1; i<=N; i++) {
			ch[i] = Integer.parseInt(st.nextToken());
			sum[i] = sum[i-1] + ch[i];
		}
//		System.out.println(Arrays.toString(sum)); // Array check
		
		
		// 5. 답 M번 출력
		StringBuilder sb = new StringBuilder();
		for (int j=0; j<M; j++) {
			st = new StringTokenizer(in.readLine(), " ");
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			sb.append(sum[e]-sum[s-1]).append('\n');
		}
		System.out.println(sb.toString());
	}

}
