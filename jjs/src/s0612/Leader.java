package s0612;

public class Leader extends Student{
	boolean lead;
	
	void isLeader() {
		if(lead==true)
			System.out.println(name + "학급회장");
		else
			System.out.println(name + "학급회장 아니다");
	}
}
