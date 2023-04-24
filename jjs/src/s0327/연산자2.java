package s0327;
import java.util.Scanner;
public class 연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b;
		char op;
		System.out.print("숫자a:");
		a = sc.nextInt();
		System.out.print("숫자b:");
		b = sc.nextInt();
		System.out.print("연산자:");
		op = sc.next().charAt(0);
		
		if(op=='+')
			System.out.printf("%d+%d=%d",a,b,a+b);
		else if(op=='-')	
			System.out.printf("%d+%d=%d",a,b,a-b);
		else if(op=='*')	
			System.out.printf("%d+%d=%d",a,b,a*b);
		else if(op=='/')	
			System.out.printf("%d+%d=%d",a,b,a/b);
	}

}
