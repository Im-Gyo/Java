//https://programmers.co.kr/learn/courses/30/lessons/64061?language=java
package CodingTest;

import java.util.Stack;

public class CraneGameForkakao {
	public int solution(int[][] board, int[] moves) {
		board = new int[][] {{0,0,0,0,0},{1,2,5,2,0},{1,1,4,3,2},{5,5,2,1,3},{1,2,5,1,2}};
		moves = new int[] {1,4,2,3,5}; 
		int answer = 0;
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(board[i][j] != 0) {
					System.out.println(board[i][j]);			
					board[i][j] = 0;
				}
			}
		}
		
		Stack<Integer> stack = new Stack<Integer>();
		
		
		return answer;
	}
}
