import java.util.ArrayList;

public class Inventory {

	ArrayList inventory= new ArrayList ();
	/*sm,20130806: Ginge nicht einfach 'public class Inventory extends ArrayList<Object>'?
	               Dann haetten Sie die Methoden 'add', 'remove' etc. gratis. */
	
		
	public Inventory(){
	}
	
	public void addInventory(Object item){
		inventory.add(item);
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
