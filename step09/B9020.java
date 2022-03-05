package step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

public class B9020 {
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int testCase = Integer.parseInt(br.readLine());
		
		for(int i = 0; i< testCase; i++) {
			int  num = Integer.parseInt(br.readLine());
			int prime1 = 0;
			int prime2 = 0;
			int prime1_1 = 0;
			for(int j = 2; j <= num/2; j++) {
				boolean flag = false;
				for(int k = 2; k*k <= j; k++) {
					if(j % k == 0) {
						flag = false; break;
					}
					else {flag = true;}	
				}
				if(j == 2 || j == 3) {
					flag = true;
				}
				if(flag == true) {
					prime1 = j;
					
					num = num - prime1;
					boolean golden = false;
					for(int p = 2; p*p<= num; p++) {
						if(num % p == 0) {golden = false; break;}
						else {golden = true;}
					}
					if(num == 2 || num == 3) golden = true;
					
					if(golden == true) {
						prime1_1 = num;
						prime2 = num;
					}
					else prime2 = 0;
					num = num + prime1;
				}
			}
			if(prime2 == 0) {
				prime1 = num - prime1_1;
				prime2 = num - prime1;
			}
			sb.append(prime1).append(" ").append(prime2).append("\n");
		}
		System.out.println(sb);
	}
}
