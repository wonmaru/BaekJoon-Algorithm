package step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1085 {
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		if(st.hasMoreElements()) {
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int h = Integer.parseInt(st.nextToken());
			double w2 = (double)w/2.0; double h2 = (double)h/2.0;
			if(x>w2 && y<h2) {
				if(y <= w-x) sb.append(y);
				else sb.append(w-x);
			}
			else if(x>w2 && y>h2) {
				if(h-y<= w-x) sb.append(h-y);
				else sb.append(w-x);
			}
			else if(x<w2 && y>h2) {
				if(h-y <= x) sb.append(h-y);
				else sb.append(x);
			}
			else if(x<w2 && y<h2) {
				if(x<= y) sb.append(x);
				else sb.append(y);
			}
			else if(x == w2) {
				if(y>= h2) sb.append(h -y);
				else sb.append(y);
			}
			else if(y == h2) {
				if(x<= w2) sb.append(x);
				else sb.append(w-x);
			}
		}
		System.out.println(sb);
	}
}
