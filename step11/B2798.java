package step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Vector;

public class B2798 {
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int cardCount = Integer.parseInt(st.nextToken());
		int maxNum = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int arr [] = new int [cardCount];
		if(st.hasMoreTokens()) {
			for(int i = 0; i<arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
		}
		int sum = 0;
		Vector<Integer> v = new Vector<Integer>();
		for(int i = 0; i< arr.length-2; i++) {
			for(int j = i+1; j<arr.length-1; j++) {
				for(int k = j+1; k<arr.length; k++) {
					sum = arr[i] + arr[j] + arr[k];
					if(sum <= maxNum) {
						v.add(sum);
					}
				}
			}
		}
		int size = v.size();
		int max = v.get(0);
		for(int m= 0; m<size; m++) {
			if(v.get(m)>= max) {
				max = v.get(m);
			}
		}
		sb.append(max);
		System.out.println(sb);
	}
}
