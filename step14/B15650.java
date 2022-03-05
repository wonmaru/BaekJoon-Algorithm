package step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B15650 {
	static int [] arr;
	static int [] varr;
	static boolean [] visit;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		arr = new int[m];
		varr = new int [m];
		visit = new boolean[n];
		dfs(n, m, 0);
		System.out.println(sb);
	}
	public static void dfs(int n, int m, int depth) {
		int flag = 0;
		if(depth == m) {
			Arrays.sort(arr);
			for(int i = 0; i<arr.length; i++) {
				if(arr[i] != varr[i]) {
					flag +=1;
				}
			}
			if(flag == 0) {
				for(int put : varr) {
					sb.append(put + " ");
				}
				sb.append("\n");

			}
			else {
				flag = 0;
				for(int i = 0; i<arr.length; i++) {
					arr[i] = varr[i];
					/* ���� arr�迭�� ������������ ���ĵǾ� �־ ������ ������ �޶����� � ���ڰ� �Ǿ
					  ��� flag���� 0�� �� �� �����Ƿ� �ٽ� ������� ������ �ٲ������.*/
				}
			}
			return;
		}
		for(int i = 0; i<n; i++) {
			if(visit[i] == false) {
				visit[i] = true;
				arr[depth] = i+1;
				varr[depth] = i+1;
				dfs(n, m, depth+1);
				
				visit[i] = false;
			}
		}
	}
	
}
