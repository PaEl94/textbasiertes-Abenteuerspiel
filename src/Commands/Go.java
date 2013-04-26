package Commands;


public class Go extends Commands {

	String name = "go";
    //Start in Zentrum
    int position=5;

	public String getName(){
		return name;
	}

    public goCommand(){
        String direction = input.substring(input.lastIndexOf(" ")+1);
        switch(direction.toLowercase()){
            case "north":position-=3;
            case "west":position-=1;
            case "south":position+=3;
            case "east":position+=1;
            default: return 0;
        Player.setPosition(position);
        return "You are now in the ", position;
        }
    }
	
	
}
