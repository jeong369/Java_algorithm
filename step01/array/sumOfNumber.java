// 백준 제출 시 package는 제외하고 제출해야 함.
// 11720 숫자의 합 문제
package com.ktds.step01.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class sumOfNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		
		char[] ch = in.readLine().toCharArray();
		
		int result = 0;
		for (int i=0; i<ch.length; i++) {
			System.out.println(ch[i]); // str
			System.out.println(ch[i]-'0'); // int - // (int)'0' = 48 / (int)'1' = 49
			result += ch[i]-'0';
		}
		
		System.out.println(result);
	
	}

}
