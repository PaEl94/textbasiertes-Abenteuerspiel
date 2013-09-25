import java.util.ArrayList;


public class Rooms {
	ArrayList<Room> rooms = new ArrayList<Room>();
	
	
	public Rooms(ArrayList<Room> rooms) {
		this.rooms=rooms;
	}
	
	public int getRoomPosition(int a){
		Room room = rooms.get(a);
		return room.getPosition();
	}
	public ArrayList getRoomContent(int b){
		Room room = rooms.get(b);
		return room.getContent();
	}
	
}