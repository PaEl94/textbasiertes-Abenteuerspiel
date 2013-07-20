import java.util.ArrayList;
import java.lang.Class.*;

public class Inventory {
	
	static ArrayList<Object> inventory= new ArrayList<Object>();
	
		
	public Inventory(){
	}
	
	public void addInventory(Object thing){
		inventory.add(thing);
	}
	public void printInventory(){
		for(int i=0;i<inventory.size();i++)	{
			System.out.print((inventory.get(i)).getClass().getName());
			System.out.println();
		}
		
	}
	public void remove(int item){
		inventory.remove(item);
	}
	
}
