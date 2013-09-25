public class Player {
	private boolean dead;
	int position;

    public void setPosition(int p){
        position = p;
    }
    
    public int getPosition(){
    	return position;
    }

	public void setDead(boolean dead) {
		this.dead = dead;
	}

	public boolean isDead() {
		return dead;
	}
}
