package com.ktds.step04.programmers;

public class Solution_프린트 {
	// Queue
	static class Solution {
	    public int solution(int[] priorities, int location) {
	        
	    	// queue 생성
	    	// [문서의 번호, 우선순위]를 queue에 삽입
	    	// 문서가 모두 출력되면 종료(while not q.isEmpty())
	    	// 현재 출력할 문서 VS 나머지 중 얘보다 우선순위 높은 문서를 찾기
	    	// 현재 출력한 문서가 문제의 location과 같다면 종료
	    	
	        int answer = 0;
	        return answer;
	    }
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(new int[] {2, 1, 3, 2}, 2)); // 1
		System.out.println(s.solution(new int[] {1, 1, 9, 1, 1, 1}, 0)); // 5

	}

}
