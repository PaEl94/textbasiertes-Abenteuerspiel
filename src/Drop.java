import java.util.StringTokenizer;




public class Drop extends Commands{
	String name = "drop";
	String input;
	Inventory inventory;
	boolean contains;
	
	
	
	
	public Drop(String input,Inventory inv){
		this.input = input;
		this.inventory = inv;
	/*sm,20130806: Wozu benoetigen Sie ein spezielles Inventory, 
	               wo doch alle dessen Datenelement 'static' sind?*/
		
	}
	
	public String getName(){
		return name;
	}
	
	public String checkinventory(){
		StringTokenizer st = new StringTokenizer(input," ");
    	String input2 = st.nextToken();
		input2 = st.nextToken();
		
		for(int i=0;i<inventory.inventory.size();i++){
			if(inventory.inventory.get(i).getClass().getName().equalsIgnoreCase(input2)){
				contains = true;
				inventory.inventory.remove(i);
			}
		}
		if(contains==false){
			return "You have no item called " + input2 + " in your Inventory.";
		}
		else{
			return "You dropped " +input2;
		}
		
    }

}
