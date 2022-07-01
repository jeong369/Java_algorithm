package com.ktds.step06.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution_boj_단지번호붙이기 {

	static int[][] map;
	static int N;
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(in.readLine());
		map = new int[N][N];
		
		for (int i=0; i<N; i++) {
			char[] ch = in.readLine().toCharArray();
			for (int j=0; j<N; j++) {
				map[i][j] = ch[j]-'0';
			}
		}
		
		// 단지가 매겨지지 않은 집 찾기(탐색의 시작점)
		int cnt=0; // 단지 그룹의 수
		int no=2; // 단지 번호
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				if (map[i][j]==1) {
					cnt++;
					bfs(i, j, no++);
				}
			}
		}
		
		System.out.println(Arrays.deepToString(map));

	}
	
	static int[] dr = {-1, 1, 0, 0};
	static int[] dc = {0, 0, -1, 1};
	
	private static void bfs(int r, int c, int no) {
		Queue<int[]> queue = new LinkedList<int[]>();
		queue.offer(new int[] {r, c}); // 시작점
		map[r][c] = no; // 탐색 완료해서 단지에 번호를 붙여준다. - 방문체크
		
		while (!queue.isEmpty()) {
			int[] current = queue.poll(); // 하나씩 빼면서 체킹
			
			//  상,하,좌,우 확인
			for (int d=0; d<4; d++) {
				int nr = current[0] + dr[d];
				int nc = current[1] + dc[d];
				if (nr>=0 && nr<N && nc>=0 && nc<N && map[nr][nc]==1) { // 경계 안에 있고, 집일 때만 이동
					queue.offer(new int[] {nr, nc}); // 탐색 할 다음위치를 queue에 알려줌
					map[nr][nc] = no; // 단지 번호 매기기
				}
			}
			
		}
	}

}
