package step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1011 {
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int cycle = Integer.parseInt(br.readLine());
		StringTokenizer st ;
		for(int i = 0; i<cycle; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int d = y - x;
			int count = 0; int sum = 0; int index = 0;
			while(true) {
				if(sum>=d/2) break;
				sum += (count +1);
				count++;
			}
			count = count -1;//ÁøÂ¥ È½¼ö
		
			int restD = d-((sum-(count+1))*2);
			if(restD/2 >= count-1) {
				if(restD <= (count+1)*2) {
					if(restD == count-1 || restD == count || restD == count+1) index+=1;
					else index+=2;
					sb.append(count + index).append("a\n");
				}
				
			}
			else if(d == 1) sb.append("1").append("\n");
			else {
				while(true) {
				restD = restD + (count*2);
				count = count - 1;
				if(restD <= (count+1)*2) {
					if(restD == count-1 || restD == count || restD == count+1) index+=1;
					else index+=2;
					sb.append(count + index).append("b\n");
					break;
					}
				}
			}
		}
		System.out.println(sb);
	}
}
