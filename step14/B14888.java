package step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B14888 {
	static int arr [];
	static int op [] = new int [4];
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;
	static int n;
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		n = Integer.parseInt(br.readLine());
		arr = new int [n];
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0;i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i<4; i++) {
			op[i] = Integer.parseInt(st.nextToken());
		}
		
		dfs(arr[0], 1);
		System.out.println(max);
		System.out.println(min);
	}
	public static void dfs(int num, int index) {
		if(index == n) {
			min = Math.min(min, num);
			max = Math.max(max, num);
			return;
		}
		for(int i = 0; i<4; i++) {
			if(op[i]>0) {
				op[i]--;
				if(i == 0) {//덧셈일 때
					dfs(num + arr[index], index+1);
				}
				else if(i == 1) {
					dfs(num - arr[index], index+1);
				}
				else if(i == 2) {
					dfs(num * arr[index], index+1);
				}
				else if(i == 3) {
					dfs(num / arr[index], index +1);
					/*
					 * 절대값으로 처리했는데 절대값으로 처리하면 안된다!!
					 */
				}
				op[i]++;
			}
		}
	}
}
