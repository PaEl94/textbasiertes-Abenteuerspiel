import java.util.Scanner;



public class Main {

	public static void main(String args[]){	
        Text text = new Text();
        Player player = new Player();
        Scanner scan = new Scanner(System.in);
        Item firstnote = new Item();
        firstnote.setContent("");
        Inventory inv = new Inventory();
        Checkinput check = new Checkinput(inv);
		System.out.println(text.getIntro());
		Player.setPosition(5);
        inv.addInventory(firstnote);
		
		while(true){
			
            String input = scan.nextLine().toLowerCase();
            check.Check(input);
            
            
            if(player.dead == true){
            	scan.close();
            	System.out.println("You lose");
            }
		}
		
	}
	
	
}
