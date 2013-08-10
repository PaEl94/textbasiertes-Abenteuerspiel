import java.util.ArrayList;
import java.lang.Class.*;

public class Inventory {
/*sm,20130806: falsche Verwendung von 'static'? Zumindest sehr unorthodoxe.*/

	static ArrayList<Object> inventory= new ArrayList<Object>();
	/*sm,20130806: Ginge nicht einfach 'public class Inventory extends ArrayList<Object>'?
	               Dann haetten Sie die Methoden 'add', 'remove' etc. gratis. */
	
		
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
