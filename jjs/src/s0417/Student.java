package s0417;

import javax.swing.Spring;

public class Student {
		String name;
		int age;
		int grade;
		int number;
		double weight;
		
		// 생성자
		public Student(){
			weight = 50;
		}
		
		Student(String name,int age, int grade, int number, int weight){
			this.name = name;
			this.age = age;
			this.grade = grade;
			this.number = number;
			this.weight = weight;
		}		
		
		void eat() {
			weight += 1;
		}
		
		void run() {
			weight -= 1;
		}
		
		void printName() {
			System.out.println("제이름은" + name + "입니다");
			System.out.println("나이"+getAge());
			System.out.println("학년"+getGrade());
			System.out.println("번호"+ getNumber() );
			System.out.println("몸무게"+ getWeight() );
		}
		
		public void printAll() {
			printName();	
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public int getGrade() {
			return grade;
		}

		public void setGrade(int grade) {
			this.grade = grade;
		}

		public int getNumber() {
			return number;
		}

		public void setNumber(int number) {
			this.number = number;
		}

		public double getWeight() {
			return weight;
		}

		public void setWeight(double weight) {
			this.weight = weight;
		}
		
		
	}

