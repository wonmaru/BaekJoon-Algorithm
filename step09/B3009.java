package step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3009 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder ();
		int arr1 [] = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
		st = new StringTokenizer(br.readLine());
		int arr2 [] = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
		st = new StringTokenizer(br.readLine());
		int arr3 [] = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
		
		if(arr1[0] != arr2[0] ) {
			if(arr1[0] != arr3[0]) sb.append(arr1[0]).append(" ");
			else sb.append(arr2[0]).append(" ");
		}
		else {
			sb.append(arr3[0]).append(" ");
		}
		if(arr1[1] != arr2[1] ) {
			if(arr1[1] != arr3[1]) sb.append(arr1[1]).append(" ");
			else sb.append(arr2[1]).append(" ");
		}
		else {
			sb.append(arr3[1]).append(" ");
		}
		System.out.println(sb);
	}
}
