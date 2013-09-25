import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Checkinput{
	
	public void check(String input, ArrayList<Room> rooms, Rooms roomsclass, Player player, Riddle riddle, Inventory inv, Monster monster, Sword sword) throws IOException{
	
		StringTokenizer st = new StringTokenizer(input," ");
		String command = st.nextToken();
		String commandLC = command.toLowerCase();
		

        if( commandLC.equals( "go") ) {
              System.out.println(Go.checkdirection(input, player));
              }
        else if( commandLC.equals( "take") ) {
        	String target = st.nextToken().toLowerCase();
        	if(target.equals("monster")|| target.toLowerCase().equals("riddle")){
        		System.out.println("You can't pick that up.");
        		}
        	else{
        		System.out.println(Take.checkcontent(input, rooms, roomsclass, inv, player));
        		}
        	} 
        else if( commandLC.equals( "inspect") ) {
        	String target = st.nextToken().toLowerCase();
        	if (target.equals("riddle") | target.equals("wall")){
        		if(player.position == riddle.position){
        			System.out.println(riddle.checkAnswer(player));
        			}
        		else{
        			System.out.println("There nothing to inspect.");
        		}
        	}		
        	else if(target.equals("room")){
        		Inspect.printContent(rooms, roomsclass, player);
        		}
        	} 
        else if( commandLC.equals( "drop") ) {
        	System.out.println(Drop.checkInventory(rooms, roomsclass, inv, input, player));		
        	} 
        else if( commandLC.equals( "inventory") ) {
        	inv.printInventory();             		
        	}
        else if(commandLC.equals("attack")){
        	Attack.checkTier(monster, sword, player, rooms, roomsclass, inv);
        	}
        else{
        	System.out.println("I did not catch that");
        	}
        }
	}