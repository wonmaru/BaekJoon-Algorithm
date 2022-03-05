package step06;

import java.util.Scanner;
import java.util.Vector;

public class B1065 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		Vector<Integer> v = new Vector<Integer>();
		int count = 0;
		for(int i = 1; i<=num; i++) {
		while(i!=0) {
			v.add(i % 10);
			i = (i/10);
			if(v.size() == 1 || v.size() == 2) {
				count++;
			}
			else if(v.size() == 3) {
				if((v.get(0) + v.get(2)) == v.get(1)) {
					count++;
				}
			}
		}
		
	}
		System.out.println(count);
}
	}
