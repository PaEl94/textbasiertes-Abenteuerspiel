//Pascal
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Checkinput extends Commands{

	String input;
    Inventory inv;

	public Checkinput(Inventory inv) {
	this.inv = inv;
    }


    public void setInput(String input){
		this.input = input;
	}
	
	public String getInput(){
		return input;
	}


	public void Check(String input,ArrayList rooms, Rooms roomsclass){
		Go go = new Go();
		Drop drop = new Drop(input,inv);
		Take take = new Take();
		
				
		ArrayList<String> commandlist = new ArrayList<String>();
		commandlist.add(drop.getName());
		commandlist.add(go.getName());
		commandlist.add(take.getName());
		commandlist.add("hi");
	
		StringTokenizer st = new StringTokenizer(input," ");
		String command = st.nextToken();
		String commandLC = command.toLowerCase() ;

        /*sm,20130806: Von 'switch' zu 'if/else if' gewechselt, weil 'switch' 
                       erst ab SE7 mit Strings verwendet werden kann. */
        if( commandLC.equals( "go") ) {
              System.out.println(go.checkdirection(input));
  		} else if( commandLC.equals( "open") ) {
              commandlist.get(2);		
		} else if( commandLC.equals( "take") ) {
              System.out.println(take.checkcontent(input, rooms, roomsclass));		
		} else if( commandLC.equals( "inspect") ) {
			  for (int x = 0; x < rooms.size(); x++){
					if(x == Player.position){ 		
						Room thisroom = (Room) rooms.get(x);
						System.out.println(thisroom.content.get(x));
			  }
			  }		
		} else if( commandLC.equals( "use") ) {
              commandlist.get(5);		
		} else if( commandLC.equals( "drop") ) {
              System.out.println(drop.checkinventory());		
		} else if( commandLC.equals( "inventory") ) {
              inv.printInventory();             		
		} else{
              System.out.println("I did not catch that");		
		}
	}

}


