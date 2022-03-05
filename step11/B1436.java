package step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

public class B1436 {
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		String arr [] = new String [5000000];
		Vector<Integer> v = new Vector<Integer>();
		for(int i = 0; i<5000000; i++) {
			arr[i] = Integer.toString(i);
			if(arr[i].indexOf("666") != -1) {
				v.add(Integer.parseInt(arr[i]));
			}
		}
		sb.append(v.get(num-1));
		System.out.println(sb);
	}
}
