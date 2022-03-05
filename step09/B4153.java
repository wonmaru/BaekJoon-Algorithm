package step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B4153 {
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		while(true) {
			st = new StringTokenizer(br.readLine());
			int arr [] = new int [3];
			int max = 0; 
			for(int i = 0; i<arr.length; i++) {
				arr[i] =  Integer.parseInt(st.nextToken());
				if(arr[i] >= max) {
					max = arr[i];
				}
			}
			if(arr[0] == 0)break;
			
			int sum = 0;
			for(int j = 0; j<arr.length; j++) {
				sum += (arr[j]*arr[j]);
			}
			if((sum-max*max) == (max*max)) sb.append("right").append("\n");
			else sb.append("wrong").append("\n");
		}
		System.out.println(sb);
	}
}
