package step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B9663 {
	public static int[] arr;
	public static int n;
	public static int count = 0;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int [n];//n*n크기의 체스판 지정
		nQueen(0);
		System.out.println(count);
		
	}
	public static void nQueen(int depth) {
		if(depth == n) {//n*n개 판에서 n개의 퀸을 놓는 경우의 수이니까 depth가 n의 수와 같을때까지 함.
			count ++;//같을 경우 count증가시킴
			return;
		}
		for(int i = 0; i<n; i++) {
			arr[depth] = i;//
			if(possiblity(depth)) {//possiblity가 true일 경우
				nQueen(depth + 1);//nQueen에 depth +1값을 재귀 호출함.
			}
		}
	}
	public static boolean possiblity(int col) {//depth값이 col로 전달됨
		for(int i= 0; i<col; i++) {//depth값 만큼 반복
			if(arr[col] == arr[i]) {//해당 열의 값과 이전 열을 비교해 같은 위치에 퀸이 있을 경우
				return false;
			}
			else if(Math.abs(col - i) == Math.abs(arr[col] -arr[i])) {//해당 열에서 이전 열 값을 뺀 값과 해당 행에서 이전 행 값을 뺀 값이 같은것
				//즉 대각선인 경우를 말함
				return false;
			}
		}
		return true;//위 두 경우와 관련이 없을 경우와 for문에 어긋날 경우만 true 리턴
	}
}
