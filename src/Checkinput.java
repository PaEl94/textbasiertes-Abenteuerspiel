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


	public void Check(String input){
		Go go = new Go();
		Drop drop = new Drop(input,inv);
		Inspect inspect = new Inspect();
		Open open = new Open();
		Take take = new Take();
		Use use = new Use();
		
				
		ArrayList<String> commandlist = new ArrayList<String>();
		commandlist.add(drop.getName());
		commandlist.add(go.getName());
		commandlist.add(open.getName());
		commandlist.add(take.getName());
		commandlist.add(inspect.getName());
		commandlist.add(use.getName());
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
              commandlist.get(3);
              break;
		  case "inspect":
              commandlist.get(4);
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


