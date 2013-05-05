public class Player {

	boolean dead;
	String name;

    //Start im Zentrum der Karte.
	public int position=5;

    public Player(){
    }


    public void setPosition(int position){
        this.position = position;
    }
    
public int getPosition(){
    	return position;
    }

	
}
