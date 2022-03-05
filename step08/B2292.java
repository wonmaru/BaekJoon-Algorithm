package step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2292 {
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int count = 1;
		int sum = 1;
		while(true) {
			if(sum>=num) {
				System.out.println(count);
				break;
			}
			sum += 6*count;
			count++;
		}
	}
}
