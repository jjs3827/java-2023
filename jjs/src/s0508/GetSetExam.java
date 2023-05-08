package s0508;

public class GetSetExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Student 클래스의 name , grade를 수정한다.
		
		Student kim = new Student();
		System.out.println(kim.getName());
		kim.setName("김진수");
		kim.setGrade(3);
		System.out.println(kim.getName()+"는"+kim.getGrade()+"학년 입니다.");
		
		Student shin = new Student();
		shin.setName("정진수");
		shin.setGrade(2);
		shin.setScore(100);
		shin.printALL();
	}

}
