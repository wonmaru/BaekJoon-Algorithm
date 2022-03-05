package step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2941 {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String croatian [] = {"c=", "c-","dz=","d-","lj", "nj", "s=", "z="};
		String word = br.readLine();
		StringBuffer sb = new StringBuffer(word);
		int index = 0;
		int count = 0;
		while(true) {//무한반복
		for(int i = 0; i<croatian.length; i++) {//크로아티아 문자열 배열의 길이만큼 반복
			if(sb.indexOf(croatian[i])!=-1) {//만약 입력된 단어에 크로아티아 알파벳이 있다면
				if(croatian[i].equals("dz=")) {//그 크로아티아 알파벳이 dz=일 경우
					sb.replace(sb.indexOf(croatian[i]),sb.indexOf(croatian[i])+3," ");
					//스트링 버퍼에서 dz=의 문자의 시작 부분과 끝부분을 공백으로 바꾼다.
					count++;
					//dz=은 세 글자 이므로 count값을 따로 한번 더 증가시킨다.
				}
				else //크로아티아 알파벳이 dz=이 아닌 경우
					{sb.replace(sb.indexOf(croatian[i]),sb.indexOf(croatian[i])+2," ");
					//dz=을 제외하면 다 문자열 길이가 2이므로 그 부분만 공백으로 바꾼다.
					}
				count++;//count를 증가해 크로아티아 알파벳 개수를 센다.
				break;
			}
		}
		if(sb == null || index == count)
			//만약 스트링 버퍼가 비었거나 index가 count와 같이 같은,즉 더이상 크로아티아 알파벳이 없을 경우
			break;//while 무한루프 탈출.
		
		index = count;//index에 count값을 넣어둔다.
		}
		System.out.println(word.length()-count);//입력 받은 단어에서 count 값만 빼주면 구할 수 있다.
	}
}
