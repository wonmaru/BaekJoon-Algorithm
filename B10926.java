import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10926 {
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine();
		sb.append(s).append("??!");
		System.out.println(sb);
	}
}
