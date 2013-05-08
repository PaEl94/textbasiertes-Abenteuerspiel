import java.util.StringTokenizer;
public class Go extends Commands {

	String name = "go";

	public String getName(){
		return name;
	}
	Player player = new Player();
	

    public int checkdirection(String input){
    	StringTokenizer st = new StringTokenizer(input," ");
    	String input2 = st.nextToken();
		input2 = st.nextToken();
		Player.getPosition();
		
		
        if(input2.equalsIgnoreCase("north")){				
        	Player.setPosition(Player.getPosition()-3);
            }
        else if(input2.equalsIgnoreCase("west")){			
        	Player.setPosition(Player.getPosition()-1);
            }
        else if(input2.equalsIgnoreCase("south")){ 			
        	Player.setPosition(Player.getPosition()+3);
        	}
        else if(input2.equalsIgnoreCase("east")){ 			
        	Player.setPosition(Player.getPosition()+1);
            }
        else {
        	System.out.println("Go where?");
        	
        	}
        
        return Player.getPosition();

    }
}
