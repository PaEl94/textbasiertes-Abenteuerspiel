import java.util.Scanner;
import java.io.*;

public class Riddle {
	int p = 5;
	int position = generatePosition(p);
	
	public int generatePosition(int p){
		p = (int)(Math.random()*9-1+1) + 1;
		if (p == 5){
			return generatePosition(p);
		}
		else{
			return p;
		}		
	}
	
	String Riddle = "I turn my head and you may go where you want."+"\n" + "I turn it again, you will stay till you rot." + "\n" + "I have no face, but I live or die by my crooked teeth." + "\n" + "\n" + "Who am I?"; 
	String answer = "key";
	String answeralt = "a key";
	boolean solved;
	
	
	public String Checkanswer(Player player) throws IOException{
		//Scanner scan1 = new Scanner(System.in);
		InputStreamReader scanner = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(scanner);
		
		System.out.println(Riddle);
		//String playerAnswer = scan1.nextLine().toLowerCase();
		String playerAnswer = in.readLine().toLowerCase();

		if (playerAnswer.equals(answer) || playerAnswer.equals(answeralt)){
			setSolved(true);
			player.setDead(true);
			//scan1.close();
			return "You win.";
		}
		else{
		//scan1.close();	
		return "No reaction";		
		
		}
	}


	public boolean isSolved() {
		return solved;
	}


	public void setSolved(boolean solved) {
		this.solved = solved;
	}
	

}

