package step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1157 {
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine().toLowerCase();
		char arr [] =word.toCharArray();
		int count = 0;
		int index = 0;
		int alphabet [] = new int [26];
		
		for(int i = 0; i<alphabet.length; i++) {
			alphabet[i] = 0;
		}
		
		for(int i = 0; i<arr.length;i++) {
			char w = arr[i];
			alphabet[w-'a']+=1;
		}
		
		int max = alphabet[0];
		for(int i = 0; i<alphabet.length; i++) {
			if(alphabet[i]>= max) max = alphabet[i];
		}
		for(int i = 0; i<alphabet.length; i++) {
			if(alphabet[i] == max) { 
				count++;
				index = i;
			}
		}
		
		if(count==0 || count >=2) {
			System.out.println("?");
		}
		else System.out.println((char)(index + 65));	
	}	
}
