import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Checkinput extends Commands{

    Inventory inv;

	public Checkinput(Inventory inv) {
	this.inv = inv;
	}
	
	public void check(String input, ArrayList rooms, Rooms roomsclass, Player player) throws IOException{
		Go go = new Go();
		Drop drop = new Drop(input,inv, rooms, roomsclass);
		Take take = new Take();
		Riddle riddle = new Riddle(); 
		Inspect inspect = new Inspect();
		
	
		StringTokenizer st = new StringTokenizer(input," ");
		String command = st.nextToken();
		String commandLC = command.toLowerCase();
		

        if( commandLC.equals( "go") ) {
              System.out.println(go.checkdirection(input));
              }
        else if( commandLC.equals( "take") ) {
        	String target = st.nextToken().toLowerCase();
        	if(target.equals("monster")|| target.toLowerCase().equals("riddle")){
        		System.out.println("You can't pick that up.");
        		}
        	else{
        		System.out.println(take.checkcontent(input, rooms, roomsclass));
        		}
        	} 
        else if( commandLC.equals( "inspect") ) {
        	String target = st.nextToken().toLowerCase();
        	if (target.equals("riddle")){
        		System.out.println(riddle.checkAnswer(player));
        		}
        	else if(target.equals("room")){
        		inspect.printContent(rooms, roomsclass);
        		}
        	} 
        else if( commandLC.equals( "drop") ) {
        	System.out.println(drop.checkInventory(rooms, roomsclass));		
        	} 
        else if( commandLC.equals( "inventory") ) {
        	inv.printInventory();             		
        	}
        else{
        	System.out.println("I did not catch that");
        	}
        }
	}