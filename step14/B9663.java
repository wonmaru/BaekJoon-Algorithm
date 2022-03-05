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
		arr = new int [n];//n*nũ���� ü���� ����
		nQueen(0);
		System.out.println(count);
		
	}
	public static void nQueen(int depth) {
		if(depth == n) {//n*n�� �ǿ��� n���� ���� ���� ����� ���̴ϱ� depth�� n�� ���� ���������� ��.
			count ++;//���� ��� count������Ŵ
			return;
		}
		for(int i = 0; i<n; i++) {
			arr[depth] = i;//
			if(possiblity(depth)) {//possiblity�� true�� ���
				nQueen(depth + 1);//nQueen�� depth +1���� ��� ȣ����.
			}
		}
	}
	public static boolean possiblity(int col) {//depth���� col�� ���޵�
		for(int i= 0; i<col; i++) {//depth�� ��ŭ �ݺ�
			if(arr[col] == arr[i]) {//�ش� ���� ���� ���� ���� ���� ���� ��ġ�� ���� ���� ���
				return false;
			}
			else if(Math.abs(col - i) == Math.abs(arr[col] -arr[i])) {//�ش� ������ ���� �� ���� �� ���� �ش� �࿡�� ���� �� ���� �� ���� ������
				//�� �밢���� ��츦 ����
				return false;
			}
		}
		return true;//�� �� ���� ������ ���� ���� for���� ��߳� ��츸 true ����
	}
}
