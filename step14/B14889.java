package step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B14889 {
	static int n;
	static int arr [][] ;
	static int min = Integer.MAX_VALUE;
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		n = Integer.parseInt(br.readLine());
		arr = new int [n][n];
		for(int i = 0; i< n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j< n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
	}
	public static void dfs(int num, int i, int j) {
		for(int k = 0; k<n; k++) {
			
		}
		
	}
}
