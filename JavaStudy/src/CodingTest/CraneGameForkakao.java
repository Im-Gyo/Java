//https://programmers.co.kr/learn/courses/30/lessons/64061?language=java
//
package CodingTest;

import java.util.Stack;

public class CraneGameForkakao {
	public static void main(String[] args) {
		int res = solution(null, null); 
		System.out.println(res);
	}
	
	public static int solution(int[][] board, int[] moves) {
		Stack<Integer> stack = new Stack<Integer>();
		board = new int[][] {{0,0,0,0,0},{1,2,5,2,0},{1,1,4,3,2},{5,5,2,1,3},{1,2,5,1,2}};
		System.out.println(board[1][0]);
		moves = new int[] {1,4,2,3,5,2,1,4,3,3};
		System.out.println(moves[0]);
		int answer = 0;
		
		for (int j = 1; j <= moves.length; j++) {
			int indexVal = moves[j - 1];
			for (int i = 0; i < 5; i++) {
				if (board[i][indexVal - 1] != 0) {
					System.out.println(board[i][indexVal -1]);
					stack.push(board[i][indexVal -1]);			
					board[i][indexVal -1] = 0;
					break;
				}
			}
		}		
		
		return answer;
	}
}
