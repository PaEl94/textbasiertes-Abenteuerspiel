import java.util.ArrayList;


public class Rooms {
	ArrayList rooms = new ArrayList();
	
	
	public Rooms(ArrayList<Room> rooms) {
		this.rooms=rooms;
	}
	
	public int getRoomPosition(int a){
		Room room = (Room) rooms.get(a);
		return room.getPosition();
	}
	public ArrayList getRoomContent(int b){
		Room room = (Room) rooms.get(b);
		return room.getContent();
	}
}