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
		board = new int[][] {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}}; 	// �ʵ�����
		moves = new int[] {1,5,3,5,1,2,1,4};	// ũ���� ������ ����(1�� 4�� 2�� 3��)
		int answer = 0;
		//int peekIndex = 0;
		//boolean peekVal;
		
		for (int j = 1; j <= moves.length; j++) {
			int indexVal = moves[j - 1];			
			for (int i = 0; i < 5; i++) {
				if (board[i][indexVal - 1] != 0) {
					System.out.println(board[i][indexVal -1]);					
					if(stack.empty() == true) {
						stack.push(board[i][indexVal - 1]);						
						board[i][indexVal -1] =0;
						break;
					}
					else if(stack.peek() == board[i][indexVal -1]) {
						stack.pop();
						board[i][indexVal -1] = 0;
						answer += 2;
						break;
					}
					else{
						stack.push(board[i][indexVal -1]);
						board[i][indexVal -1] = 0;
						break;
					}
					/*
					 * System.out.println(board[i][indexVal -1]); //peekIndex =
					 * stack.search(stack.peek()); // ���ÿ� �ش� ���� �ִ��� Ȯ���ϰ� �ش��ϴ� �ε��� �� ��ȯ(�� ������ 1)
					 * peekIndex = stack.indexOf(stack.peek()); // ������ �ֻ���� �ε����� Ȯ��
					 * //System.out.println(peekIndex);
					 * //System.out.println(stack.elementAt(peekIndex));
					 * System.out.println(stack.empty() == false); System.out.println(stack.size()
					 * >= 2);
					 * 
					 * if((stack.empty() == false ) && (stack.size() >= 2)) {
					 * System.out.println(peekIndex); System.out.println(peekIndex-1);
					 * if(Integer.toString(stack.peek()) ==
					 * Integer.toString(stack.elementAt(peekIndex - 1))) { stack.pop(); stack.pop();
					 * answer += 1; } } board[i][indexVal -1] = 0; break;
					 */
				}
			}
		}		
		return answer;
	}
}
