package step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B3053 {
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		double pi = Math.PI;
		double result1 = pi * (double)(num * num);
		sb.append(String.format("%.6f",result1)).append("\n");
		double result2 = (double)num*num*2;
		sb.append(String.format("%.6f",result2));
		System.out.println(sb);
	}
}
