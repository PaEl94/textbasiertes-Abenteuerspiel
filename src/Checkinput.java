//Pascal
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Checkinput extends Commands{

	String input;
    Inventory inv;

	public Checkinput(Inventory inv) {
	this.inv = inv;
    }


    public void setInput(String input){
		this.input = input;
	}
	
	public String getInput(){
		return input;
	}


	public void Check(String input,ArrayList rooms){
		Go go = new Go();
		Drop drop = new Drop(input,inv);
		Take take = new Take();
		
				
		ArrayList<String> commandlist = new ArrayList<String>();
		commandlist.add(drop.getName());
		commandlist.add(go.getName());
		commandlist.add(take.getName());
		commandlist.add("hi");
	
		StringTokenizer st = new StringTokenizer(input," ");
		String command = st.nextToken();
		switch(command.toLowerCase()){  
          case "go":
              System.out.println(go.checkdirection(input));
              break;
          case "open":
              commandlist.get(2);
              break;
		  case "take":
              System.out.println(take.checkcontent(input, rooms));
              break;
		  case "inspect":
			  for (int x = 0; x < rooms.size(); x++){
					if(x == Player.position){ 		
						Room thisroom = (Room) rooms.get(x);
						System.out.println(thisroom.content.get(x));
			  }
			  }
					
              break;
		  case "use":
              commandlist.get(5);
              break;
		  case "drop":
              System.out.println(drop.checkinventory());
              break;
          case "inventory":
              inv.printInventory();             
              break;
          default:
              System.out.println("I did not catch that");
              break;
		}
	}

	
}


