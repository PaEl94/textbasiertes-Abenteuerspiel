import java.util.ArrayList;


public class Inspect {
	
		public static void printContent(ArrayList<Room> rooms, Rooms roomclass, Player player){	
			for (int x = 1; x < rooms.size()+1; x++){
				if(x == player.position){
					for(int i=0;i<roomclass.getRoomContent(x-1).size(); i++){
						System.out.println(roomclass.getRoomContent(x-1).get(i).getClass().getName());
					}
				}
		}
	}
}