import java.util.ArrayList;
import java.util.StringTokenizer;


public class Take extends Commands{
	String input;
	Inventory inventory;
	boolean contains;

	public String checkcontent(String input, ArrayList rooms, Rooms roomclass){
		StringTokenizer st = new StringTokenizer(input," ");
		String input2 = st.nextToken();
		input2 = st.nextToken();
		
		for (int x = 1; x < rooms.size()+1; x++){
			if(x == Player.position){
				for(int i=0;i<roomclass.getRoomContent(x-1).size(); i++){
					if(roomclass.getRoomContent(x-1).get(i).getClass().getName().equalsIgnoreCase(input2)){
						contains = true;
						Inventory.inventory.add(roomclass.getRoomContent(x-1).get(i));
						roomclass.getRoomContent(x-1).remove(i);
						}
					}
				}
			}
		if(contains==false){
			return "There is no item called " + input2 + " in this room.";
			}
		else{
			return "You added " + input2 + " to your Inventory";
		}
	}
}