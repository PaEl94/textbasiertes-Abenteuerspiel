
public class Sword{
	int tier = 1;
	int position = generatePosition(5);
	public int getTier() {
		return tier;
	}

	public void setTier(int tier) {
		this.tier = tier;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}	
	public int generatePosition(int p){
		p = (int)(Math.random()*9-1+1) + 1;
		if (p == 5){
			return generatePosition(p);
		}
		else{
			return p;
		}		
	}
}

