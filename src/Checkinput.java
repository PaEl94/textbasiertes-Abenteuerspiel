
//Pascal
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Checkinput extends Commands{
		


	static String input;
	static String input2;


	public Checkinput() {
	}
	
	public static void setInput(String input){
		input = input;
	}
	
	
	public static String getInput(){
		return input;
	}

	
	public static void setInput2(String input){
		input2 = input.substring(input.trim().lastIndexOf(" ")+1,input.trim().length());
		
	}
	
	
	public static String getInput2(){
		return input;
	}


	public Object Check(String a){
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
	
		StringTokenizer st = new StringTokenizer(a," ");
		String command = st.nextToken();
		switch(command.toLowerCase()){  
		  case "drop":return  commandlist.get(0);
          case "go":return Go.getPosition(input);
		  case "open":return commandlist.get(2);
		  case "take":return commandlist.get(3);
		  case "inspect":return commandlist.get(4);
		  case "use":return commandlist.get(5);
		  case "hi":return "Hi!" ;
		 default:return "I did not catch that";
		}
	}

	
}


