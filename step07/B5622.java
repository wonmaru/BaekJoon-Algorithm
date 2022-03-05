package step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5622 {
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char arr [] = br.readLine().toCharArray();
		int intArr [] = new int [arr.length];
		int time = 0;
		for(int i = 0; i<arr.length; i++) {
			intArr[i] = arr[i] - 'A';
		}
		for(int i = 0; i<intArr.length; i++) {
			if(intArr[i] == 18 ||intArr[i]== 21 ||intArr[i]== 24 ||intArr[i]== 25 ||intArr[i]== 26) {
				time += (intArr[i]/3 + 2);
			}
			
			else time +=(intArr[i]/3 + 3);
		}
		System.out.println(time);
	}
}
