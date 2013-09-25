import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) throws IOException{	
        Text text = new Text();
        Player player = new Player();
        Scanner scan = new Scanner(System.in);
        Inventory inv = new Inventory();
        Checkinput check = new Checkinput();
        Riddle riddle = new Riddle();
        Sword sword = new Sword();
        Monster monster = new Monster();
		player.setPosition(5);
		
		ArrayList<Room> rooms = new ArrayList<Room>();

        for(int x = 1; x < 10; x++){
        	Room room = new Room();
        	room.setPosition(x);
        	if(room.getPosition()==riddle.position){
        		room.content.add(riddle);
        		}
        	if (room.getPosition()==sword.position){
        		room.content.add(sword);
        		}
        	if (room.getPosition()==monster.position){
        		room.content.add(monster);
    			}
        	rooms.add(room);
        	}
        
        Rooms roomclass = new Rooms(rooms);

        System.out.println(text.intro);

		while(player.isDead()==false){
            String input = scan.nextLine().toLowerCase();
            check.check(input, rooms,roomclass, player, riddle, inv, monster, sword);
            	}
    	scan.close();
	}
}