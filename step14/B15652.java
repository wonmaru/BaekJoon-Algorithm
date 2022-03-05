package step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B15652 {
	static int [] arr;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		arr = new int[m];
		dfs(n, m, 0);
		System.out.println(sb);
	}
	public static void dfs(int n, int m, int depth) {
		if(depth == m) {
			for(int val : arr) {
				sb.append(val + " ");
			}
			sb.append("\n");
			return;
		}
		int at = 1;
		if(depth != 0)
			at = arr[depth-1];
		for(int i = at; i<=n; i++) {
			arr[depth] = i;
			dfs(n, m, depth + 1);
			
		}
	}
}
