package step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

public class B2231 {
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Vector<Integer> v = new Vector<Integer>();
		int num = Integer.parseInt(br.readLine());
		for(int a = 0; a<2; a++) {
			for(int b = 0; b<10; b++) {
				for(int c = 0; c<10; c++) {
					for(int d = 0; d<10; d++) {
						for(int e = 0; e<10; e++) {
							for(int f = 0; f<10; f++) {
								for(int g = 0; g<10; g++) {
									if((a*1000000+b*100000+c*10000+d*1000+e*100 + f*10 + g+ a+b+c+d+e+f+g) == num) {
										int k = a*1000000+b*100000+c*10000+d*1000+e*100 + f*10 + g;
										v.add(k);
									}
								}
							}
						}
					}
				}
			}
		}
		if(v.isEmpty()) sb.append(0);
		else sb.append(v.get(0));
		System.out.println(sb);
	}
}
