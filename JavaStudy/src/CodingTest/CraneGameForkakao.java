//https://programmers.co.kr/learn/courses/30/lessons/64061?language=java
//
package CodingTest;

import java.util.Stack;

public class CraneGameForkakao {
	public static void main(String[] args) {
		int res = solution(null, null);		
	}
	
	public static int solution(int[][] board, int[] moves) {
		Stack<Integer> stack = new Stack<Integer>();
		board = new int[][] {{0,0,0,0,0},{1,2,5,2,0},{1,1,4,3,2},{5,5,2,1,3},{1,2,5,1,2}}; 	// 필드정보
		moves = new int[] {1,4,2,3,5,2,1,4,3,3};	// 크레인 움직임 정보(1줄 4줄 2줄 3줄)
		int answer = 0;
		int peekIndex = 0;
				
		for (int j = 1; j <= moves.length; j++) {
			int indexVal = moves[j - 1];			
			for (int i = 0; i < 5; i++) {
				if (board[i][indexVal - 1] != 0) {
					//System.out.println(board[i][indexVal -1]);
					stack.push(board[i][indexVal -1]);
					peekIndex = stack.search(stack.peek());
					if((stack.empty() != false) )
					System.out.println(stack.search(stack.peek()));
					board[i][indexVal -1] = 0;
					break;
				}
			}
		}		
		System.out.println(stack.peek());
		return answer;
	}
}
