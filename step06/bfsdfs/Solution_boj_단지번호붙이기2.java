package com.ktds.step06.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution_boj_단지번호붙이기2 {

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
					dfs(i, j, no++);
				}
			}
		}
		
		System.out.println(Arrays.deepToString(map));

	}
	
	static int[] dr = {-1, 1, 0, 0};
	static int[] dc = {0, 0, -1, 1};
	
	private static void dfs(int r, int c, int no) {
		map[r][c] = no; // 탐색 완료해서 단지에 번호를 붙여준다. - 방문체크
		
		//  상,하,좌,우 확인
		for (int d=0; d<4; d++) {
			int nr = r + dr[d];
			int nc = c + dc[d];
			if (nr>=0 && nr<N && nc>=0 && nc<N && map[nr][nc]==1) { // 경계 안에 있고, 집일 때만 이동
				dfs(nr, nc, no);
			}
		}
			
	}

}
