public class Player {

	boolean dead;
	String name;

    //Start im Zentrum der Karte.
	public static int position=5;

    public Player(){
    }


    public static void setposition(int position){
        position = Player.position;    
    }
	
    public int getPosition(){
    	return position;
    }


	
}
