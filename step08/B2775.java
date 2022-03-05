package step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2775 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int testNum = Integer.parseInt(br.readLine());
		for(int i = 0; i<testNum; i++) {
			int K = Integer.parseInt(br.readLine());//Ãþ
			int N = Integer.parseInt(br.readLine());//È£
			
			int apt [][] = new int [15][15];
			for(int j = 0; j<15; j++) {
				apt [0][j] = j;
				apt [j][1] = 1;
			}
			for(int k = 1; k<15; k++) {
				for(int n =2; n<15; n++) {
					apt [k][n] = apt[k][n-1] + apt[k-1][n];
				}
			}
			sb.append(apt[K][N]).append("\n");
		}
		System.out.println(sb);
	}
}
