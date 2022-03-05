package step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10872 {
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int result = factorial(n);
		sb.append(result);
		System.out.println(sb);
	}
	public static int factorial(int num) {
		if(num == 1 || num == 0) return 1;
		return num * factorial(num -1);
	}
}
