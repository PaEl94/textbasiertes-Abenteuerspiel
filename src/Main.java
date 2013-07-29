import java.util.ArrayList;
import java.util.Scanner;



public class Main {

	public static void main(String args[]){	
        Text text = new Text();
        Player player = new Player();
        Scanner scan = new Scanner(System.in);
        Inventory inv = new Inventory();
        Checkinput check = new Checkinput(inv);
        
        Item item = new Item();
        
		Player.setPosition(5);
		ArrayList<Room> rooms = new ArrayList<Room>();
		inv.addInventory(item);
        
        for(int x = 0; x < rooms.size(); x++){
        	Room room = new Room(x, item);
        	x = room.position;
        	room.content.add(item);
        	rooms.add(room);

        	}
        for(int x = 0; x < rooms.size(); x++){ //Ueberprueft Inhalt von rooms
        	System.out.print(rooms.get(x).toString());
        	}

        System.out.println(text.getIntro());

		while(true){
			
            String input = scan.nextLine().toLowerCase();
            check.Check(input, rooms);
            
            
            if(player.dead == true){
            	scan.close();
            	System.out.println("You lose");
            }
		}
		
	}
	
	
}
