import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) throws IOException{	
        Text text = new Text();
        Player player = new Player();
        Scanner scan = new Scanner(System.in);
        Inventory inv = new Inventory();
        Checkinput check = new Checkinput(inv);
        Riddle riddle = new Riddle();
        Item item = new Item();
        
		Player.setPosition(5);
		
		ArrayList<Room> rooms = new ArrayList<Room>();
		inv.addInventory(item);
        
        for(int x = 1; x < 10; x++){
        	Item roomitem = new Item();
        	Room room = new Room();
        	room.setPosition(x);
        	room.content.add(roomitem);
        	if(room.getPosition()==riddle.position){
        		room.content.add(riddle);
        		}
        	rooms.add(room);
        	}
        
        Rooms roomclass = new Rooms(rooms);

        System.out.println(text.intro);

		while(player.isDead()==false){
            String input = scan.nextLine().toLowerCase();
            check.check(input, rooms,roomclass, player, riddle);
            
		}
    	scan.close();
	}
}