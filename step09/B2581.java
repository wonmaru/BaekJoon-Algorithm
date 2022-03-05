package step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2581 {
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		int index = 0;
		for(int i = M; i<= N; i++) {
			boolean flag = false;
			if(i == 2 || i==3) flag = true;
			for(int j = 2; j*j<= i; j++) {
				if(i%j == 0) {
					flag = false;break;
				}
				else flag = true;
			}
			if(flag == true) {
				sum += i;
				if(index == 0) index = i;
			}
		}
		if(sum == 0) System.out.println(sb.append(-1));
		else System.out.print(sb.append(sum).append("\n").append(index));
	}
}
