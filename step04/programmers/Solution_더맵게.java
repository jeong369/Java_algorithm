package com.ktds.step04.programmers;

import java.util.PriorityQueue;

public class Solution_더맵게 {
	// 최소힙
	static class Solution {
	    public int solution(int[] scoville, int K) {
	    	
	    	PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
	    	
	    	// 최소힙 정렬하기
	    	for (int s : scoville) {
	    		queue.offer(s);
	    	}
	    	
	    	int answer = 0;
	    	for (int i=0; i<scoville.length-1; i++) {
	    		if (queue.peek() < K) {
		    		int l1 = queue.poll() ; // 가장 작은 값
		    		int l2 = queue.poll() ; // 두번째 작은 값
		    		int l3 = l1 + l2*2;
		    		queue.offer(l3);
		    		answer++;
	    		} else {
	    			break; // 속도 빨라짐
	    		}
	    	}
	    	
	    	// 예외처리
	    	if (queue.peek() < K) {
	    		return -1;
	    	} else {
	    		return answer;	    		
	    	}
	    	
	    	// return queue.peek()<K ? -1 : answer;
	    	
	    }
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(new int[] {1, 1, 2}, 10)); // -1
	
	}

}
