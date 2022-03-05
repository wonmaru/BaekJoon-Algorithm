package step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10809 {
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int alphabet [] = new int [26];
		String word = br.readLine();
		for(int i = 0; i<alphabet.length; i++) {
			alphabet[i] = -1;
		}
		for(int j = 0; j<word.length(); j++) {
			char ch = word.charAt(j);
			if(alphabet[ch-'a'] == -1) {
				 alphabet[ch-'a'] = j;
			}
		}
		for(int a = 0; a<alphabet.length; a++) {
			System.out.print(alphabet[a] + " ");
		}
	}
}
