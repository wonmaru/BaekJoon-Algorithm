package step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10870 {
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		sb.append(fibonacci(n));
		System.out.println(sb);
	}
	private static int fibonacci(int num) {
		if (num == 0) return 0;
		else if (num == 1) return 1;
		else return fibonacci(num-1) + fibonacci(num-2);
	}
}
