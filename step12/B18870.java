package step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B18870 {
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		HashMap<Integer,Integer> rank = new HashMap<Integer,Integer>();
		
		int n = Integer.parseInt(br.readLine());
		int [] origin = new int [n];
		int [] sort = new int [n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i<n; i++) {
			sort[i] =origin[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(sort);
		int index = 0;
		for(int i = 0; i<n; i++) {
			if(!rank.containsKey(sort[i])) {
			rank.put(sort[i], index);
			index++;
			}
		}
		for(int key : origin) {
			sb.append(rank.get(key)+ " ");
		}
		System.out.println(sb);
	}
}
