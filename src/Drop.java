import java.util.ArrayList;
import java.util.StringTokenizer;

public class Drop extends Commands{
	String input;
	Inventory inventory;
	boolean contains;
	
	
	public Drop(String input,Inventory inv, ArrayList rooms, Rooms roomclass){
		this.input = input;
		this.inventory = inv;
	}
		
	public String checkInventory(ArrayList rooms, Rooms roomsclass){
		StringTokenizer st = new StringTokenizer(input," ");
    	String input2 = st.nextToken();
		input2 = st.nextToken();
		for (int x = 1; x < rooms.size()+1; x++){
			if(x == Player.position){
				for(int i=0;i<inventory.inventory.size();i++){
					if(inventory.inventory.get(i).getClass().getName().equalsIgnoreCase(input2)){
						contains = true;
						roomsclass.getRoomContent(x-1).add(roomsclass.getRoomContent(x-1).get(i));
						inventory.inventory.remove(i);
						}
					}
				}
			}
		if(contains==false){
			return "You have no item called " + input2 + " in your Inventory.";
		}
		else{
			return "You dropped " + input2;
		}	
    }
}