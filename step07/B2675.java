package step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2675 {
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		
		for(int k = 0; k<num; k++) {
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int testNum = Integer.parseInt(st.nextToken());
		String word = st.nextToken();
		char c [] = new char [word.length()];
		
		for(int i = 0; i< word.length(); i++) {
			c [i] = word.charAt(i);
			for(int j = 0; j<testNum; j++) {
				sb.append(c[i]);
			}
		}
		sb.append("\n");
		}
		System.out.println(sb);
	}
}
