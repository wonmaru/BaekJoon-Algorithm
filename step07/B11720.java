package step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11720 {
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		String num = br.readLine();
		int intArray [] = new int [n];
		int sum = 0;
		for(int i = 0; i<n; i++) {
			intArray[i] = (num.charAt(i) - '0');
			sum += intArray[i];	
		}
		sb.append(sum);
		System.out.println(sb);
	}
}
