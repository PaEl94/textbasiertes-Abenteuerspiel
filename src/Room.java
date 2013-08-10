
import java.util.ArrayList;

public class Room {
	
	public ArrayList<Object> content = new ArrayList<Object>();

	int position;
		
	public void setPosition(int position) {
		this.position = position;
	}



	public int getPosition() {
		return position;
	}



	
	public ArrayList getContent(){
		return content;
	}
}
