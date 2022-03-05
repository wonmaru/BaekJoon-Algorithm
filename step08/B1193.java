package step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1193 {
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int i = 0;
		int sum = 0;
		while(sum < n) {
			sum += i;
			i++;
		}
		
		if((i-1)%2 == 0) {
			int p = (i-1) - (n-(sum - (i-1))) + 1;
			int c = n - (sum - (i-1));
			System.out.println(c+ "/" + p );
			}
		else {
			int p = n - (sum - (i-1));
			int c = sum - n + 1;
			System.out.println(c+ "/" + p);
		}
	}
}
