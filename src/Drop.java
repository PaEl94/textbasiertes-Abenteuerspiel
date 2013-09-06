import java.util.ArrayList;
import java.util.StringTokenizer;

public class Drop{
	
	public static String checkInventory(ArrayList rooms, Rooms roomsclass, Inventory inventory, String input, Player player){
		StringTokenizer st = new StringTokenizer(input," ");
		boolean contains = false;

    	String input2 = st.nextToken();
		input2 = st.nextToken();
		for (int x = 1; x < rooms.size()+1; x++){
			if(x == player.position){
				for(int i=0;i<inventory.inventory.size();i++){
					if(inventory.inventory.get(i).getClass().getName().equalsIgnoreCase(input2)){
						contains = true;
						roomsclass.getRoomContent(x-1).add(inventory.inventory.get(i));
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