package step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class B10757 {
	public static void main(String [] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		BigInteger num1 = new BigInteger(st.nextToken());
		BigInteger num2 = new BigInteger(st.nextToken());
		sb.append(num1.add(num2));
		System.out.println(sb);
	}
}
