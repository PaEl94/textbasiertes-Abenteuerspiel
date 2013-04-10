import java.util.ArrayList;


public class Inventory {
	
	ArrayList<Item> inventory= new ArrayList<Item>();
	Item it = new Item();
		
	public Inventory(Item firstnote){
		 inventory.add(firstnote);
	}
	
	public void addInventory(Item thing){
		inventory.add(thing);
	}
	public void printInventory(){
		for(int i=0;i<inventory.size();i++)	{
			System.out.print(inventory.get(i).name);
			System.out.println();
		}
		
	}
}
