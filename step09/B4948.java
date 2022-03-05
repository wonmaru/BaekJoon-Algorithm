package step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B4948 {
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			int num = Integer.parseInt(br.readLine());
			if(num == 0) break;
			int index = 0;
			for(int i = (num+1); i<= 2*num; i++) {
				boolean flag = false;
				for(int j = 2; j*j<= i; j++) {
					if(i == 0 || i%j == 0) {flag = false; break;}
					else {
						flag = true;
					}
				}
				if(i == 2||i == 3) flag = true;
				if(flag == true) {
					index ++;
				}
			}
			sb.append(index).append("\n");
		}
		System.out.println(sb);
	}
}
