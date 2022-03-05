package step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//선택정렬로 오름차순 정렬하기
public class B2750 {
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		int arr [] = new int [count];
		for(int i = 0; i<count; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		for(int i = 0; i<count; i++) {
			for(int j = i+1; j <count; j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		for(int i = 0; i<count; i++) {
			System.out.println(arr[i]);
		}
	}
}
