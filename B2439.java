import java.util.*;
public class B2439 {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i = 0; i< n; i++) {
			
			for(int k = i; k<n-1; k++) {
			System.out.print(" ");
			}
			for(int j = 0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
