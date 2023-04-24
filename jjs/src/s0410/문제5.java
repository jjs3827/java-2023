package s0410;
import java.util.Scanner;

public class 문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("숫자입력:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		int i = 1;
		while(i <= num) {
			if(i%2 != 0) {
				sum += i;
				System.out.print("+" + i);
			}
			else {
				sum -= i;
				System.out.print("-" + i);
				
			}
			i++;
		}
		System.out.println("=" + sum);
	}

}
