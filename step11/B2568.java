package step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2568 {
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int w [] = new int [n];
		int h [] = new int [n];
		for(int i = 0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			w[i] = Integer.parseInt(st.nextToken());
			h[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i<n; i++) {
			int index = 0;
			for(int j = 0; j<n; j++) {
				if(w[i]<w[j] && h[i]<h[j]) index++;
			}
			sb.append(index+1).append(" ");
		}
		System.out.println(sb);
	}
}
