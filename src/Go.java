import java.util.StringTokenizer;
public class Go extends Commands {


    public int checkdirection(String input){
    	StringTokenizer st = new StringTokenizer(input," ");
    	String input2 = st.nextToken();
		input2 = st.nextToken();
		boolean[] moveperm = new boolean[]{false,false,false,false};
		switch(Player.getPosition()){
		//moveperm[0]=north, moveperm[1]=east, moveperm[2]=south, moveperm[3]=west
			case 1:
				moveperm[1]=true;
				moveperm[2]=true;
				break;
			case 2:
				moveperm[1]=true;
				moveperm[2]=true;
				moveperm[3]=true;
				break;
			case 3:
				moveperm[2]=true;
				moveperm[3]=true;
				break;
			case 4:
				moveperm[1]=true;
				moveperm[2]=true;
				moveperm[0]=true;
				break;
			case 5: 
				moveperm[0]=true;
				moveperm[1]=true;
				moveperm[2]=true;
				moveperm[3]=true;
				break;
			case 6:
				moveperm[3]=true;
				moveperm[2]=true;
				moveperm[0]=true;
				break;
			case 7:
				moveperm[1]=true;
				moveperm[0]=true;
				break;
			case 8:
				moveperm[1]=true;
				moveperm[3]=true;
				moveperm[0]=true;
				break;
			case 9:
				moveperm[3]=true;
				moveperm[0]=true;
				break;
				
		}
		
        if(input2.equalsIgnoreCase("north")){
        	if(moveperm[0]){
        		Player.setPosition(Player.getPosition()-3);
            }
        	else{
            	System.out.println("You can't go that way!");
            }
    	}
        else if(input2.equalsIgnoreCase("west")){
        	if(moveperm[3]){
        		Player.setPosition(Player.getPosition()-1);
            }
        	else{
                System.out.println("You can't go that way!");
        	}
        }
        else if(input2.equalsIgnoreCase("south")){
        	if(moveperm[2]){
        		Player.setPosition(Player.getPosition()+3);
        	}
        	else{
                System.out.println("You can't go that way!");
            }
        }
        else if(input2.equalsIgnoreCase("east")){ 	
        	if(moveperm[1]){
        		Player.setPosition(Player.getPosition()+1);
            }
        	else{
                System.out.println("You can't go that way!");
            }
        }
        else {
        	System.out.println("Go where?");
        	}
        return Player.getPosition();

    }
}
