package com.ktds.step01.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ArrayTest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Scanner sc = new Scanner(System.in); // 따로 형 변환 안함 - 읽을 때 개행이나 탭이나 동일하게 읽음
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); // 2바이트씩 읽음
		
		int n = Integer.parseInt(in.readLine()); // n이 들어올 때 받아서 사용		
		// 배열 생성 : new 데이터타입[크기]
		int[] scores = new int[n]; //0~2 offset(첫 번째 원소로부터 얼마나 떨어져있는가)
		
		StringTokenizer st = new StringTokenizer(in.readLine(), " ");
		
		for (int i=0; i<scores.length; i++) {
			scores[i] = Integer.parseInt(st.nextToken()); // + StringTokenizer 해주면 탭 구별 가능
//			scores[i] = Integer.parseInt(in.readLine()); // 개행을 구별함
//			scores[i] = sc.nextInt(); // 하나씩 입력 받아서 저장
		}
		
		StringBuilder sb = new StringBuilder(); // 출력 모아서 한꺼번에 출력해주는 것 : 과부하 줄이기
		for (int i:scores) { // forEach
//			System.out.println(i); // 하나씩 출력
			sb.append(i).append("\n");
		}
		System.out.println(sb.toString());
		
		// =========================================
		
//		int[] arr = {1,2,3}; // 1) 편리한 방법
		int[] arr = new int[] {1,2,3}; // 2) 선언 해줘야 함
		System.out.println(Arrays.toString(arr));
		

	}

}
