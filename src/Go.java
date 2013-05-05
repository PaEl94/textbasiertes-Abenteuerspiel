import java.util.StringTokenizer;
public class Go extends Commands {

	String name = "go";

	public String getName(){
		return name;
	}
	

    public void checkdirection(String input){
        Player player = new Player();
    	StringTokenizer st = new StringTokenizer(input,"go ");
		String input2 = st.nextToken();
        int position = player.getPosition();

//        switch(input2.toLowerCase()){
//            case "north":
//                position-=3;
//            case "west":
//                position-=1;
//            case "south":
//                position+=3;
//            case "east":
//                position+=1;
//            default: System.out.println("Go where?");
//        }
        
        
        //GLeich wie kommentiert, nur mit elif und .equals()
        if(input2.equalsIgnoreCase("north") == true){				//funktioniert nicht
            position-=3;
            }
        else if(input2.equalsIgnoreCase("west") == true){			//funktioniert 
            position-=1;
            }
        else if(input2.equalsIgnoreCase("south") == true){ 			//funktioniert
        	position+=3;
        	}
        else if(input2.equalsIgnoreCase("east") == true){ 			//funktioniert nicht
            position+=1;
            }
        else {
        	System.out.println("Go where?");
        	}
        
        player.setPosition(position);
        System.out.println(position);

    }
}
