package step06;
//거의 포기...

public class B4673 {
	public static void main(String [] args) {
		int index = 10000;
		boolean arr [] = new boolean [index];
		for(int i = 0; i< index; i++) {
			if(d(i+1)<index+1) 
				arr[d(i=1)-1] = true;
		}
		for(int j = 0; j<index; j++) {
			if(arr[j] == false)
				System.out.println(j+1);
		}
	}
	static int d (int n) {
		int num = n;
		while(n>0) {
			num += (n%10);
			num/=10;
		}
		return num;
	}
}
