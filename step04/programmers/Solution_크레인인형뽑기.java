package com.ktds.step04.programmers;

import java.util.Arrays;
import java.util.Stack;

public class Solution_크레인인형뽑기 {
	// Stack
	static class Solution {
	    public int solution(int[][] board, int[] moves) {
	        
//			System.out.println(Arrays.deepToString(board));
			
			int N = board.length;
			Stack<Integer> result = new Stack<Integer>(); // N*N

			int answer = 0;
			for (int m : moves) {
//				System.out.println("m" + m);
				for (int i=0; i<N; i++) {
					if (board[i][m-1] != 0) {
						
						if(result.size() == 0 || result.peek()!=board[i][m-1]) {
							result.push(board[i][m-1]);	
//							System.out.println("맨 위 : "+result.peek());
						} else if (result.size() != 0 && result.peek()==board[i][m-1]) {
							result.pop();
							answer += 2;
						}
						board[i][m-1] = 0;													
						break;
					}
				}
//				System.out.println(Arrays.deepToString(board));
//				System.out.println(result.size());
//				System.out.println("============================");
			}
	    	
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		System.out.println(s.solution(board, new int[] {1,5,3,5,1,2,1,4}));
		
	}

}
