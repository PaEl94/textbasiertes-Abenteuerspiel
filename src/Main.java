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
        
        for(int x = 0; x < 8; x++){
        	Room room = new Room(x, item);
        	room.position = x;
        	room.content.add(item);
        	rooms.add(room);

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
