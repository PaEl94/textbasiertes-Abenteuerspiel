//Pascal
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

import Commands.Go;
import Commands.Drop;
import Commands.Inspect;
import Commands.Open;
import Commands.Take;
import Commands.Use;

public class Checkinput {

	public Checkinput() {
	}
	public Object Check(String a){
		Go go = new Go();
		Drop drop = new Drop();
		Inspect inspect = new Inspect();
		Open open = new Open();
		Take take = new Take();
		Use use = new Use();
		ArrayList<String> commands = new ArrayList<String>();
		commands.add(drop.getName());
		commands.add(go.getName());
		commands.add(open.getName());
		commands.add(take.getName());
		commands.add(inspect.getName());
		commands.add(use.getName());
		commands.add("hi");
	
		StringTokenizer st = new StringTokenizer(a," ");
		String command = st.nextToken();
		switch(command.toLowerCase()){  
		  case "drop":return  commands.get(0);
          case "go":Commands.Go.goCommand();
		  case "open":return commands.get(2);
		  case "take":return commands.get(3);
		  case "inspect":return commands.get(4);
		  case "use":return commands.get(5);
		  case "hi":return "Hi!" ;
		 default:return "I did not catch that";
		}
	}
	
}


