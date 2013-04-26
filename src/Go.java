

public class Go extends Commands {

	String name = "go";
    //static int position;
    String direction;
    Checkinput check = new Checkinput();

	public String getName(){
		return name;
	}
	
	String input = Checkinput.getInput();
	
	
	

	public static int getPosition(String input2){
        String direction = Checkinput.input2;
        System.out.println(Checkinput.input2);
        System.out.println(direction);
        int position = Player.position;
        switch(direction.toLowerCase()){
            case "north":position-=3; Player.setposition(position);
            case "west":position-=1; Player.setposition(position);
            case "south":position+=3; Player.setposition(position);
            case "east":position+=1; Player.setposition(position);
            default: return position;
            
           
        }
    }
    

	
}
