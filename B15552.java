import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
//ctrl + shift + o�� ó������.
public class B15552 {
	public static void main(String [] args) throws IOException {//try catch�� ��� throws IOException���� ����ó��.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;//BufferedReader�� 
		int n = Integer.parseInt(br.readLine());//�Է� �ް� �ٷ� ���� ��ȯ���ֱ�
		for(int i = 0; i<n; i++) {//�Է¹��� ��������ŭ �ݺ�.
			st = new StringTokenizer(br.readLine()," ");//�������� ���ڿ� �и�.
			// StringTokenizer(br.readLine());���� �ص� ���� ����.
			bw.write((Integer.parseInt(st.nextToken()) + (Integer.parseInt(st.nextToken())) +"\n" ));
			//BufferedWriter�� �� ���� ��ģ �� ���ۿ� �����ϱ�.
			//�ٹٲ� �ڵ����� �Ұ��ϴ� ���๮�� �߰�.
		}
		br.close();//���۸��� �ݱ�
		bw.flush();//flush �޼ҵ�� �� ����ϱ�
		bw.close();//Bufferedwriter �ݱ�
	}
}
