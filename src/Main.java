
public class Main {

	public static void main(String args[]){

		Text intro = new Text();
		System.out.print(intro.getIntro());
		Item firstnote = new Item();
		Inventory inv = new Inventory("firstnote");
		inv.printInventory();

		
	}
	
	
}
