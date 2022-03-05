package step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class B10814 {
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		String arr [][] = new String[n][2];
		for(int i = 0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken();
		}
		
		Arrays.sort(arr,new Comparator<String[]>() {
			@Override
			public int compare(String []s1, String []s2) {
				return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
			}
		});
		/*나이순 정렬함. 나이순 정렬 할 경우 나이가 같은경우 0이 출력 되어 위치 변화가 없어서 자연스럽게 입력순
		 으로 배열 된다.
		 */
		for(int i = 0; i<n; i++) {
			sb.append(arr[i][0] + " " + arr[i][1]).append("\n");
		}
		System.out.println(sb);
	}
}
