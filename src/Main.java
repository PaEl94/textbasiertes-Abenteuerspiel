import java.util.Scanner;



public class Main {

	public static void main(String args[]){	
        Text text = new Text();
        Player player = new Player();
        Scanner scan = new Scanner(System.in);
        Checkinput check = new Checkinput();
		System.out.println(text.getIntro());
		Player.setPosition(5);
		
		while(true){
            String input = scan.nextLine();
            check.Check(input);
            
            
            if(player.dead == true){
            	scan.close();
            	System.out.println("You lose");
            }
		}
		
	}
	
	
}
