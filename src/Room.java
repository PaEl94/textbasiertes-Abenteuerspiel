
import java.util.ArrayList;



public class Room {
	
	public static ArrayList<Object> content = new ArrayList<Object>();

	int position;
	
	
	
	public int getPosition() {
		return position;
	}



	public Room(int pos, Object Item){
		this.position=pos-1;
	}
	
	public ArrayList getContent(){
		return content;
	}
}
