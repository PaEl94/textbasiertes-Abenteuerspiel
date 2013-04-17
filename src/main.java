import java.util.Scanner;


public class main {

	public static void main(String args[]){	
		Text text = new Text();
		Checkinput check = new Checkinput();
		Scanner scan = new Scanner(System.in);
		System.out.println(text.getIntro());
		while(true){
		String input = scan.nextLine();
		System.out.println(check.Check(input));
		}	
		
		//TODO: Generiert Liste mit allen Commands um diese 
		//dann mit dem Spielerinput zu vergleichen.
		//public Field[] getFields(Commands){
		//}
	}
	
	
}
