package step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11653 {
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder ();
		int num = Integer.parseInt(br.readLine());
		for(int i = 2; i*i<= num; i++) {
			//어떤 N이 두 개이상 곱셈(인수)으로 나타낼 수 있을 때 인수 중 한 개 이상은 반드시 √N보다 작거나 같다
			while((num % i) == 0) {
				sb.append(i).append("\n");
				num /= i;
			}
		}
		if(num != 1) {
			sb.append(num);
		}
		System.out.println(sb);
}}
