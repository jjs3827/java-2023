package s0410;
import java.util.Scanner;
public class 문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String name[] = new String[2];
		int [][]score = new int[2][3];
		int sum = 0;
		double avg = 0;
		for(int i = 0;i < 2 ;i ++) {
			System.out.println("학생" + (i+1) + "이름입력:");
		name[i] = sc.next();
		for(int j = 0;j < 3;j++) {
			System.out.println("성적" + (j+1) + "입력:");
			score[i][j] = sc.nextInt();
		}
		}
			
		System.out.println("*****이력완료*******");
		for(int i = 0;i < 2;i++) {
			sum = 0;
			for(int j = 0;j < 3;j++) {
				sum += score[i][j];
			}
			System.out.println(name[i] + "학생의 총점 :" + sum);
			avg = sum/3.0;
			System.out.printf("평균:%.2f\n",avg);
			
			if(avg>=90)
				System.out.printf("학생의 등급은 A 입니다");
			else if(avg>=80)
				System.out.printf("학생의 등급은 B 입니다");
			else if(avg>=70)
				System.out.printf("학생의 등급은 C 입니다");
			else if(avg>=60)
				System.out.printf("학생의 등급은 D 입니다");
			else
				System.out.printf("학생의 등급은 E 입니다");
		}
	}

}
