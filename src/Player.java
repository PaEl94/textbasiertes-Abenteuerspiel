public class Player {
/*sm,20130806: falsche Verwendung von 'static' (3-mal).*/
	boolean dead;

	static int position;


    public Player(){
    }


    public static void setPosition(int p){
        position = p;
    }
    
    public static int getPosition(){
    	return position;
    }


	public void setDead(boolean dead) {
		this.dead = dead;
	}


	public boolean isDead() {
		return dead;
	}

	
}
