package s0515;

public class ItemMain {

	public static void main(String[] args) {
		Item phone = new Item("갤럭시 S22+");
		
		phone.price = 900000;
		phone.printItemInfo();
		
		Item phone2 = new Item("Iphone 12",1500);
		phone2.printItemInfo();
		
		Item ram = new Item("DDRS",200);
		ram.printItemInfo();
		

	}

}
