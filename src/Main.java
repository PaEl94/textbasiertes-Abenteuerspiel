import java.util.Scanner;



public class Main {

	public static void main(String args[]){	
		Text text = new Text();
		Go go = new Go();
		Checkinput check = new Checkinput();
		Scanner scan = new Scanner(System.in);
		System.out.println(text.getIntro());
		while(true){
		String input = scan.nextLine();
		Checkinput.setInput(input);
		System.out.println(check.Check(input));
		//System.out.println(Go.getPosition(input));
		}	
		
		//TODO: Generiert Liste mit allen Commands um diese 
		//dann mit dem Spielerinput zu vergleichen.
		//public Field[] getFields(Commands){
		//}
	}
	
	
}