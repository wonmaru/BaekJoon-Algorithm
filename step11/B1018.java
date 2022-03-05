package step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1018 {//https://st-lab.tistory.com/101 참고. //블로그쓰기.
	public static int min = 64;//static 필드 선언
	public static Boolean arr [][];//static필드 선언
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int col = Integer.parseInt(st.nextToken());
		int row = Integer.parseInt(st.nextToken());
		
		//입력받은 체스판을 2차원 배열로 저장하기
		arr  = new Boolean[col][row];
		for(int i = 0; i<col; i++) {
			String str = br.readLine();
			for(int j = 0; j<arr[i].length; j++) {
				if(str.charAt(j) == 'W') {//W면 true
					arr[i][j] = true;
				}
				else {
					arr[i][j] = false;
				}
			}
		}
		//알고리즘은 생각해냈지만 구현을 해내지 못함..
		int col2 = col - 7;
		int row2 = row -7;
		for(int i = 0; i<col2; i++) {
			for(int j = 0; j<row2;j++) {
				find(i,j);//static 메소드를 사용해 쉽게 구현함. 
				//나는 메소드를 쓸 생각을 못해서 엄청 지저분한 코드로 구현되었음.
			}
		}
		System.out.println(min);
	}
	
	//경우의 수만큼 최소값 비교하는 메소드
	public static void find(int x, int y) {
		int endRow = y + 8;// x부터 체스판 크기인 +8까지
		int endCol = x + 8;// y부터 체스판 크기인 +8까지
		int count = 0;
		
		boolean TF = arr[x][y];//맨 첫번째 체스판 색깔 저장. 이거에 따라 min값은 또 달라지기 때문.
		
		for(int i = x; i<endCol; i++) {
			for(int j = y; j<endRow; j++) {
				if(arr[i][j] != TF)
					count++;//같지 않을 경우 count 증가(바꿔야하는 횟수)
				TF = !TF;//교차로 T F가 바뀌므로 TF = !TF
			}
			TF = !TF;//줄이 바뀌면 또 T F 순이 바뀌므로 TF = !TF
		}
		
		//Math.min(double a, double b) 메소드 사용해 최소값 저장하기
		count = Math.min(count, 64-count);
		/*64- count값은 기준 체스판 색깔 순서가 반대일때 바꿔야하는 횟수를 가르킴.
		 더 작은 값을 count에 저장하기*/
		
		min = Math.min(count, min);//Math.min(a, b)메소드로 갱신된 최소값을 저장함.
	}
}
