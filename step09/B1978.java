package step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1978 {
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int count = 0;
		int arr [] = new int [N];
		
		for(int i = 0; i<N; i++) {
			boolean flag = false;
			arr[i] = Integer.parseInt(st.nextToken());
			for(int j = 2; j*j<=arr[i];j++) {
				
				if(arr[i] % j == 0 || arr[i] == 1) {
					flag = false; break;
				}
				else flag = true;
			}
			if(arr[i] == 3 || arr[i] == 2) flag = true;
			if (flag == true) {
				count++;
			}
		}
		System.out.println(sb.append(count));
	}
}
