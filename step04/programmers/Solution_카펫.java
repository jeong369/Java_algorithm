package com.ktds.step04.programmers;

import java.util.Arrays;

public class Solution_카펫 {
	// 완전탐색
	// 카펫의 가로 길이는 세로 길이와 같거나, 세로 길이보다 깁니다.
	// 노란격자는 갈색격자로 둘러쌓여있다 -> 최소 3x3
	
	static class Solution {
	    public int[] solution(int brown, int yellow) {
	        int total = brown + yellow;
	        int height, weight, temp; // 단순 선언
	    	int target = (int)Math.sqrt(total);
	    	for (height=3; height<=target; ++height) {
	    		if(total%height != 0)  continue; // 나누어 떨어지지 않으면 패스
	    		weight = total/height;
	    		temp = height*2+weight*2-4;
	    		if (temp==brown) {
	    			return new int[] {weight, height};
	    		}
	    	};
	    	
	    	return new int[] {};
	    }
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(Arrays.toString(s.solution(10, 2))); // [4, 3]
		System.out.println(Arrays.toString(s.solution(8, 1))); // [3, 3]
		System.out.println(Arrays.toString(s.solution(24, 24))); // [8, 6]
	}
}
