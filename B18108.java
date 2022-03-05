import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B18108 {
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int year = Integer.parseInt(br.readLine());
		sb.append(year - 543);
		System.out.println(sb);
	}
}
