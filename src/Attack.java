import java.util.ArrayList;

public class Attack {
	public static void checkTier(Monster monster, Sword sword, Player player, ArrayList<Room> rooms, Rooms roomsclass, Inventory inventory){
		for (int x = 1; x < rooms.size()+1; x++){
			int tier;
			if (inventory.inventory.contains(sword)){
				tier = sword.getTier();
			}
			else{
				tier = 0;
			}
			if(x == player.position){
				if(monster.getTier() > tier){
					player.setDead(true);
					System.out.println("You lost.");
				}
				else if(monster.getTier() <= tier){
					
					for(int i=0;i<rooms.get(x-1).getContent().size(); i++){ //RETURNT FALSE, AUCH WENN TRUE SEIN SOLLTE.
						if(rooms.get(x-1).getContent().get(i).getClass().getName().equalsIgnoreCase("Monster")){
							rooms.get(x-1).getContent().remove(i);
							System.out.println("You beat the monster.");
							
						}
						else{
							System.out.println("error");
						}
					}
				}
			}
		}
	}
}
		

