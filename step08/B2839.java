package step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2839 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int sugar = Integer.parseInt(br.readLine());
		int index = 0;
		
		while(true) {
			if(sugar%5==0) {//���� ������ �ٷ� 5�� ���������� �̰� �ּ� �������̹Ƿ� �ٷ� ���
				sb.append(index + sugar/5);
				break;
				}
			else {
				sugar -= 3;
				index++;
				//�ƴ϶�� �������� 3�� ���� 3�� �� Ƚ���� ���� ���� index�� �ø���.(������� ġ�� ��)
				}
			
			if(sugar<0) {//���� -=3�� �ϴ� ������ 0���� �۾����� 5kg�� 3kg�� ���� �� ���� ���̱⿡
				sb.append(-1);//-1 �߰��� break;
				break;
				}
			// �� ������ �����̰ų� ������ 5�� ������ �������� �� �۾��� �ݺ��Ѵ�.
			}
		System.out.println(sb);
	}
}//�� ��¥ �����ϰ� �ߴµ�...�ٸ����� �䳢���� ��������...
