package step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2580 {
	// ������ ����. ���޵� ��� ���� 2���� �迭 ���� 0�� ��� ���ڸ� �־�� ��
	// ������� ������ ���ڰ� ��ġ������ Ȯ��
	// ������� ������ ���ڰ� ��ġ���� Ȯ��
	// 3*3ũ���� �簢������ ������ ���ڰ� ��ġ���� Ȯ��
	
	static int arr [][];
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		arr = new int [9][9];//9*9ũ���� ������ 2���� �迭�� ����
		
		for(int i = 0; i<9; i++) {//������ �� �־��� ������ ä���
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j<9; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		sdoku(0,0);//0,0 �迭���� �˻� ����(sdoku�Լ� ȣ��)
		
	}
	public static void sdoku(int row, int col) {
		if(col == 9) {//���࿡ ���� 9�� �Ǹ�
			sdoku(row+1,0);//���� 1�������ְ� ���� �ٽ� 0���� �ʱ�ȭ
			return;
		}
		if(row == 9) {//���� ���� 9�� �Ǹ� �迭 8,8���� ��� �������� �̾߱���
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i<9;i++) {
				for(int j = 0; j<9; j++) {
					sb.append(arr[i][j] + " ");
				}
				sb.append("\n");
			}
			System.out.println(sb);
			System.exit(0);//���� ��� ȣ���� �������� �ʰ� �����Ƿ� �ð� ����
		}
		
		if(arr[row][col] == 0) {
			for(int i = 1; i<=9; i++) {
				if(discriminate(row, col, i)) {
					arr[row][col] = i;
					sdoku(row, col+1);
				}
			}
			arr[row][col] = 0;//�̰ž��ϸ�
			return;//���� ����� ���� �� �� �ʿ�����?
			//������ �Ұ����ϸ� �ʱ�ȭ�صα�. ���ȣ��� ���� �Լ� ó���� �ٽ� ó�� �Ǳ� ����
			//����� �غ���...
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