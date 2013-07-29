import java.util.ArrayList;
import java.util.StringTokenizer;


public class Take extends Commands{
	String name = "take";
	String input;
	Inventory inventory;
	boolean contains;

	
	public String getName(){
		return name;
	}
	
	public String checkcontent(String input, ArrayList rooms){
		StringTokenizer st = new StringTokenizer(input," ");
    	String input2 = st.nextToken();
		input2 = st.nextToken();
				
		for (int x = 1; x < rooms.size(); x++){
			if(x == Player.position){ 		//Fucking watch this one.
				Room thisroom = (Room) rooms.get(x);
				for(int i=0;i<thisroom.content.size(); i++){
					if(thisroom.content.get(i).getClass().getName().equalsIgnoreCase(input2)){
						contains = true;
						thisroom.content.remove(i);
						Inventory.inventory.add(i);
					}
				}
			}
		}
		if(contains==false){
			return "There is no item called " + input2 + " in this room.";
		}
		else{
			return "You added " +input2 +"to your Inventory";
		}
	}
}
