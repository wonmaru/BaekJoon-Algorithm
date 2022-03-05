package step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1427 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int arr [] = new int [str.length()];
		for(int i = 0; i<str.length(); i++) {
			arr[i] = str.charAt(i)-'0';
		}
		
		for(int i = 0; i<arr.length;i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[j] > arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i = 0; i<arr.length; i++) {
			sb.append(arr[i]);
		}
		System.out.println(sb);
	}
}
