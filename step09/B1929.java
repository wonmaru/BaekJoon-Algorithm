package step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1929 {
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		for(int i = num1; i<=num2; i++) {
			boolean flag = false;
			for(int j = 2; j*j<= i; j++) {
				if(i % j == 0 || i == 1) {
					flag = false; break;
				}
				else flag = true;
			}
			if( i == 2 || i == 3) flag = true;
			if(flag == true) sb.append(i).append("\n");
		}
		System.out.println(sb);
	}
}
