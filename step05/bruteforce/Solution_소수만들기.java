package com.ktds.step05.bruteforce;

import java.util.Arrays;

public class Solution_소수만들기 {
	// 조합
	
	static class Solution {
		// 소수 체크
		public boolean isPrime(int value) {
			for (int l=2; l<=Math.sqrt(value); l++) {
	    		if (value%l==0) {
	    			return false;
	    		}
	    	}
	    	return true;
		}
		
		// main
	    public int solution(int[] nums) {
	    	int N = nums.length;
	    	int answer = 0; // 소수의 개수 = 정답
	    	
	    	// nums 중 3개 뽑기 (조합)
	    	for (int i=0; i<N; i++) {
	    		for (int j=i+1; j<N; j++) {
	    			for (int k=j+1; k<N; k++) {
	    				int sum = nums[i]+nums[j]+nums[k];
	    				if(isPrime(sum)) {
	    					answer++;
	    				}
	    			}
	    		}
	    	}
	        return answer;
	    }
	}
	

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(new int[] {1,2,3,4})); // 1
		System.out.println(s.solution(new int[] {1,2,7,6,4})); // 4

	}
}
