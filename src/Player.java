public class Player {
/*sm,20130806: falsche Verwendung von 'static' (3-mal).*/
	boolean dead;
	String name;

     //Start im Zentrum der Karte.
	static int position;


    public Player(){
    }


    public static void setPosition(int p){
        position = p;
    }
    
    public static int getPosition(){
    	return position;
    }

	
}
