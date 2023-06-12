package s0612;

public class Cafe {
	private int coffee;
	private int sugar;
	private int cream;
	
	priavate static int count = 0;
	
	public void makeTea(int coffee) {
		count++;
		this.coffee = coffee;
		System.out.println("블랙커피:");
	}
	public void makeTea(int coffee,int sugar) {
		count++;
		this.coffee = coffee;
		this.sugar = sugar;
		System.out.println("설탕커피:" + (coffee + sugar));
	}
	public void makeTea(int coffee,int sugar,int cream) {
		count++;
		this.coffee = coffee;
		this.sugar = sugar;		
		this.cream = cream;
		System.out.println("크림커피:" + (coffee + sugar + cream));
	}
	public void printCount() {
		// TODO Auto-generated method stub
		System.out.println("총 판매 수량:"+count);
		
	}
	
}
