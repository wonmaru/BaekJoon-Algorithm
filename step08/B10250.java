package step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10250 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testNum = Integer.parseInt(br.readLine());
		for(int i = 0; i<testNum; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int H =Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			
			if(N%H != 0) {
				System.out.println((N%H) * 100 + (N/H)+1);
			}
			else {
				System.out.println(H*100 + (N/H));
			}
		}
	}
}
