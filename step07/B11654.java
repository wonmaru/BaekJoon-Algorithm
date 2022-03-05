package step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11654 {
	public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringBuilder sb = new StringBuilder();
	char N = br.readLine().charAt(0);
	int ascii = N;
	sb.append(ascii);
	System.out.println(sb);
	}
}
