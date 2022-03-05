package step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1316 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		for(int i = 0; i<n; i++) {
			boolean flag = true;
			char charArr [] = br.readLine().toCharArray();
			for(int j = 0; j<charArr.length-1;j++) {
				for(int k = j+1; k<charArr.length; k++) {
					if(charArr[j] == charArr[k]) {
						if(charArr[k] != charArr[k-1])
							{flag = false;}
					}
				}
			}
			if (flag == true) count++;
		}
		System.out.println(count);
	}
}
