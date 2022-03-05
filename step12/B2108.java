package step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class B2108 {
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		ArrayList<Integer> list = new ArrayList<Integer>();
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i<n; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		double sum = 0.0;
		for(int value : list) {
			sum += value;
		}
		sb.append(Math.round((sum/n))).append("\n");
		Collections.sort(list);
		sb.append(list.get(n/2)).append("\n");
		
		int [] arr = new int [n];
		int [] counting = new int[8001];
		for(int i = 0; i<n; i++) {
			arr[i] = list.get(i);
		}
		for(int i = 0; i<arr.length; i++) {
			counting[arr[i]+4000]++;
		}
		int max = counting[0];
		Vector<Integer> v = new Vector<Integer>();
		for(int i = 0; i<counting.length; i++) {
			if(max<=counting[i]) {
				max = counting[i];
			}
		}
		for(int i = 0; i<counting.length; i++) {
			if(max == counting[i])
				v.add(i-4000);
		}
		if(v.size() == 1) sb.append(v.elementAt(0)).append("\n");
		else sb.append(v.elementAt(1)).append("\n");
		sb.append(Collections.max(list)-Collections.min(list));
		System.out.println(sb);
	}
}
