package step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2580 {
	// 스도쿠 문제. 전달된 행과 열의 2차원 배열 값이 0일 경우 숫자를 넣어야 함
	// 가로행과 대입할 숫자가 겹치지는지 확인
	// 세로행과 대입할 숫자가 겹치즌지 확인
	// 3*3크기의 사각형에서 대입할 숫자가 겹치는지 확인
	
	static int arr [][];
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		arr = new int [9][9];//9*9크기의 스도쿠를 2차원 배열로 선언
		
		for(int i = 0; i<9; i++) {//스도쿠 판 주어진 값으로 채우기
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j<9; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		sdoku(0,0);//0,0 배열부터 검사 시작(sdoku함수 호출)
		
	}
	public static void sdoku(int row, int col) {
		if(col == 9) {//만약에 열이 9가 되면
			sdoku(row+1,0);//행을 1증가해주고 열은 다시 0으로 초기화
			return;
		}
		if(row == 9) {//만약 행이 9가 되면 배열 8,8까지 모두 돌았음을 이야기함
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i<9;i++) {
				for(int j = 0; j<9; j++) {
					sb.append(arr[i][j] + " ");
				}
				sb.append("\n");
			}
			System.out.println(sb);
			System.exit(0);//남은 재귀 호출을 수행하지 않고 끝내므로 시간 절약
		}
		
		if(arr[row][col] == 0) {
			for(int i = 1; i<=9; i++) {
				if(discriminate(row, col, i)) {
					arr[row][col] = i;
					sdoku(row, col+1);
				}
			}
			arr[row][col] = 0;//이거안하면
			return;//백준 제출시 오류 뜸 왜 필요하지?
			//스도쿠가 불가능하면 초기화해두기. 재귀호출로 남은 함수 처리시 다시 처리 되기 때문
			//디버그 해보기...
		}
		sdoku(row,col+1);
	}
	
	public static boolean discriminate(int row, int col, int num) {
		for(int i = 0; i<9; i++) {
			if(arr[row][i] == num) {
				return false;
			}
		}
		for(int i = 0; i<9; i++) {
			if(arr[i][col] == num) {
				return false;
			}
		}
		int rowSet = (row/3)*3;
		int colSet = (col/3)*3;
		for(int i = rowSet; i<rowSet+3; i++) {
			for(int j = colSet; j<colSet+3; j++) {
				if(arr[i][j] == num) {
					return false;
				}
			}
		}
		return true;
	}
}