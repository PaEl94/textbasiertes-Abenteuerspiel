//Pascal
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Checkinput extends Commands{

	String input;

	public Checkinput() {
	}

    public void setInput(String input){
		this.input = input;
	}
	
	public String getInput(){
		return input;
	}


	public String Check(String input){
		Go go = new Go();
		Drop drop = new Drop();
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
		  
          case "go":System.out.println(go.checkdirection(input));
          case "open":return commandlist.get(2);
		  case "take":return commandlist.get(3);
		  case "inspect":return commandlist.get(4);
		  case "use":return commandlist.get(5);
		  case "hi":return "Hi!" ;
		  case "drop":return  commandlist.get(0);
          default:System.out.println("I did not catch that");return "error";
		}
	}

	
}


