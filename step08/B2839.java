package step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2839 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int sugar = Integer.parseInt(br.readLine());
		int index = 0;
		
		while(true) {
			if(sugar%5==0) {//만약 설탕이 바로 5로 나누어지면 이게 최소 봉지수이므로 바로 출력
				sb.append(index + sugar/5);
				break;
				}
			else {
				sugar -= 3;
				index++;
				//아니라면 설탕에서 3을 빼고 3을 뺀 횟수를 세기 위해 index를 올린다.(나누기로 치면 몫)
				}
			
			if(sugar<0) {//설탕 -=3을 하다 설탕이 0보다 작아지면 5kg와 3kg로 나눌 수 없는 수이기에
				sb.append(-1);//-1 추가후 break;
				break;
				}
			// 즉 설탕이 음수이거나 설탕이 5로 나누어 질때까지 이 작업을 반복한다.
			}
		System.out.println(sb);
	}
}//난 진짜 복잡하게 했는데...앨리스의 토끼굴을 조심하자...
