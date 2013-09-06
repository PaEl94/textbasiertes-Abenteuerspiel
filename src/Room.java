
import java.util.ArrayList;

public class Room {
	
	public ArrayList content = new ArrayList();

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
