package step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2908 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb1;
		StringBuffer sb2;
		StringTokenizer st = new StringTokenizer(br.readLine());
		sb1 = new StringBuffer(st.nextToken());
		sb2 = new StringBuffer(st.nextToken());
		int num1 = Integer.parseInt(sb1.reverse().toString());
		int num2 = Integer.parseInt(sb2.reverse().toString());
		if(num1>num2) System.out.println(num1);
		else System.out.println(num2);
	}
}
