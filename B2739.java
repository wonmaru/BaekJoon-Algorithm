import java.util.*;
public class B2739 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int startNum = scanner.nextInt();
		for(int i = 1; i<10;i++) {
			System.out.println(startNum + " * " + i + " = " + startNum*i);
		}
	}
}
