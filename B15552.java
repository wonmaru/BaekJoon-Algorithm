import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
//ctrl + shift + o로 처리가능.
public class B15552 {
	public static void main(String [] args) throws IOException {//try catch문 대신 throws IOException으로 에외처리.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;//BufferedReader는 
		int n = Integer.parseInt(br.readLine());//입력 받고 바로 정수 변환해주기
		for(int i = 0; i<n; i++) {//입력받은 정수값만큼 반복.
			st = new StringTokenizer(br.readLine()," ");//공백으로 문자열 분리.
			// StringTokenizer(br.readLine());으로 해도 무리 없음.
			bw.write((Integer.parseInt(st.nextToken()) + (Integer.parseInt(st.nextToken())) +"\n" ));
			//BufferedWriter에 두 값을 합친 값 버퍼에 저장하기.
			//줄바꿈 자동지원 불가하니 개행문자 추가.
		}
		br.close();//버퍼리더 닫기
		bw.flush();//flush 메소드로 값 출력하기
		bw.close();//Bufferedwriter 닫기
	}
}
