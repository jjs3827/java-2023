
public class 변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a = 128;
			byte b = (byte)a;
			System.out.println(b);
			
			String s1 = "java!";
			String s2 = "java";
			if(s1==s2)	{
				System.out.println("같은주소");
			}
			else {
				System.out.println("다른주소");	
			}
			String s3 = new String("abc");
			String s4 = new String("abc");
			if(s3==s4)	{
				System.out.println(s3+"같은주소");
			}
			else {
				System.out.println(s3+"다른주소");	
			}
			
	}

}
