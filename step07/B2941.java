package step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2941 {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String croatian [] = {"c=", "c-","dz=","d-","lj", "nj", "s=", "z="};
		String word = br.readLine();
		StringBuffer sb = new StringBuffer(word);
		int index = 0;
		int count = 0;
		while(true) {//���ѹݺ�
		for(int i = 0; i<croatian.length; i++) {//ũ�ξ�Ƽ�� ���ڿ� �迭�� ���̸�ŭ �ݺ�
			if(sb.indexOf(croatian[i])!=-1) {//���� �Էµ� �ܾ ũ�ξ�Ƽ�� ���ĺ��� �ִٸ�
				if(croatian[i].equals("dz=")) {//�� ũ�ξ�Ƽ�� ���ĺ��� dz=�� ���
					sb.replace(sb.indexOf(croatian[i]),sb.indexOf(croatian[i])+3," ");
					//��Ʈ�� ���ۿ��� dz=�� ������ ���� �κа� ���κ��� �������� �ٲ۴�.
					count++;
					//dz=�� �� ���� �̹Ƿ� count���� ���� �ѹ� �� ������Ų��.
				}
				else //ũ�ξ�Ƽ�� ���ĺ��� dz=�� �ƴ� ���
					{sb.replace(sb.indexOf(croatian[i]),sb.indexOf(croatian[i])+2," ");
					//dz=�� �����ϸ� �� ���ڿ� ���̰� 2�̹Ƿ� �� �κи� �������� �ٲ۴�.
					}
				count++;//count�� ������ ũ�ξ�Ƽ�� ���ĺ� ������ ����.
				break;
			}
		}
		if(sb == null || index == count)
			//���� ��Ʈ�� ���۰� ����ų� index�� count�� ���� ����,�� ���̻� ũ�ξ�Ƽ�� ���ĺ��� ���� ���
			break;//while ���ѷ��� Ż��.
		
		index = count;//index�� count���� �־�д�.
		}
		System.out.println(word.length()-count);//�Է� ���� �ܾ�� count ���� ���ָ� ���� �� �ִ�.
	}
}
