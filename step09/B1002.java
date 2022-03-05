package step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1002 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int testCase = Integer.parseInt(br.readLine());
		for(int i = 0; i<testCase; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			int d = (int)(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
			if(r1 == r2 && x1 == x2 && y1 == y2) {
				sb.append(-1).append("\n");
			}
			else if (d > (int)Math.pow(r2+r1, 2) || d < (int)Math.pow(r2-r1, 2)) {
				sb.append(0).append("\n");
			}
			else if (d == (int)Math.pow(r1+r2, 2) || d == (int)Math.pow(r2-r1, 2)) {
				sb.append(1).append("\n");
			}
			else {
				sb.append(2).append("\n");
			}
		}
		System.out.println(sb);
	}
}
