package step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1018 {//https://st-lab.tistory.com/101 ����. //��α׾���.
	public static int min = 64;//static �ʵ� ����
	public static Boolean arr [][];//static�ʵ� ����
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int col = Integer.parseInt(st.nextToken());
		int row = Integer.parseInt(st.nextToken());
		
		//�Է¹��� ü������ 2���� �迭�� �����ϱ�
		arr  = new Boolean[col][row];
		for(int i = 0; i<col; i++) {
			String str = br.readLine();
			for(int j = 0; j<arr[i].length; j++) {
				if(str.charAt(j) == 'W') {//W�� true
					arr[i][j] = true;
				}
				else {
					arr[i][j] = false;
				}
			}
		}
		//�˰����� �����س����� ������ �س��� ����..
		int col2 = col - 7;
		int row2 = row -7;
		for(int i = 0; i<col2; i++) {
			for(int j = 0; j<row2;j++) {
				find(i,j);//static �޼ҵ带 ����� ���� ������. 
				//���� �޼ҵ带 �� ������ ���ؼ� ��û �������� �ڵ�� �����Ǿ���.
			}
		}
		System.out.println(min);
	}
	
	//����� ����ŭ �ּҰ� ���ϴ� �޼ҵ�
	public static void find(int x, int y) {
		int endRow = y + 8;// x���� ü���� ũ���� +8����
		int endCol = x + 8;// y���� ü���� ũ���� +8����
		int count = 0;
		
		boolean TF = arr[x][y];//�� ù��° ü���� ���� ����. �̰ſ� ���� min���� �� �޶����� ����.
		
		for(int i = x; i<endCol; i++) {
			for(int j = y; j<endRow; j++) {
				if(arr[i][j] != TF)
					count++;//���� ���� ��� count ����(�ٲ���ϴ� Ƚ��)
				TF = !TF;//������ T F�� �ٲ�Ƿ� TF = !TF
			}
			TF = !TF;//���� �ٲ�� �� T F ���� �ٲ�Ƿ� TF = !TF
		}
		
		//Math.min(double a, double b) �޼ҵ� ����� �ּҰ� �����ϱ�
		count = Math.min(count, 64-count);
		/*64- count���� ���� ü���� ���� ������ �ݴ��϶� �ٲ���ϴ� Ƚ���� ����Ŵ.
		 �� ���� ���� count�� �����ϱ�*/
		
		min = Math.min(count, min);//Math.min(a, b)�޼ҵ�� ���ŵ� �ּҰ��� ������.
	}
}
