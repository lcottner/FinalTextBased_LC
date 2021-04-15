/**
* The Map program represents a map that the player can use 
* to help them during their journey.
*
* @author  Lacey Cottner
* @version 1.0
* @since   2021-04-14 
*/
package main;

public class Map{
	private static Room [][] map= new Room[5] [5];
	private static Player player=new Player();
	private static Item pouch=new Item();
	
	/**
	 * This is the win method, which is used to check
	 * if the player has achieved the win condition
	 * of making a fishing pole
	 * 
	 * @param unused
	 * @return nothing
	 */
	public static boolean win() {
		if (pouch.isFishing()==true)
			return true;
		else
			return false;
	}
	
	/**
	 * This is the get method, which can result in the player getting
	 * a stick or cobweb. It is called when the command
	 * "get (item)" is entered while in a Room with cobweb or a stick.
	 * 
	 * @param String
	 * @return nothing
	 */
	public static void get(String second) {
		if (map[player.getI()][player.getJ()].getItem().equals("") ||
				map[player.getI()][player.getJ()].getItem().equals("table"))
			System.out.println("There is nothing here to get");
		else {
			if (second.equals("stick")) {
				System.out.println("You grab the stick");
				pouch.setStick(pouch.getStick()+1);
				map[player.getI()][player.getJ()].setDescription("");
				map[player.getI()][player.getJ()].setSymbol("-");
				map[player.getI()][player.getJ()].setItem("");
			}
			if (second.equals("cobweb")) {
				System.out.println("You grab at the cobwebs, but they crumble into string");
				pouch.setString(pouch.getString()+1);
				map[player.getI()][player.getJ()].setDescription("");
				map[player.getI()][player.getJ()].setSymbol("-");
				map[player.getI()][player.getJ()].setItem("");
			}
				
		}
			
	}
	
	/**
	 * This is the use method, which checks to see if the
	 * player has the required materials to make 
	 * a fishing pole. It is called when the command
	 * "use table" is entered while in the Room with the table.
	 * 
	 * @param String
	 * @return nothing
	 */
	public static void use(String second) {
		if (map[player.getI()][player.getJ()].getItem().equals("")||
				map[player.getI()][player.getJ()].getItem().equals("string") ||
				map[player.getI()][player.getJ()].getItem().equals("stick"))
			System.out.println("There is nothing here to use");
		else {
			if (second.equals("table") && pouch.getStick()==3 && pouch.getString()==2) {
				System.out.println("You craft a fishing pole out of 3 sticks and 2 string");
				pouch.setStick(0);
				pouch.setString(0);
				pouch.setFishing(true);
			}
			else 
				System.out.println("You do not have the required materials");
		}
	}
	
	/**
	 * This is the createRoom method, which initializes
	 * a 2d array of Rooms
	 * 
	 * @param unused
	 * @return nothing
	 */
	public static void createRoom() {
	for (int i=0; i<map.length;i++) {
		for (int j=0; j<map[0].length;j++) {
			map[i][j]=new Room();
		}
	}
	}
	
	/**
	 * This is the displayMap method, which 
	 * displays the 2d array of Rooms when the command "map"
	 * is entered
	 * 
	 * @param unused
	 * @return nothing
	 */
	public static void displayMap() {
		for (int i=0; i<map.length;i++) {
			for (int j=0; j<map[0].length;j++) {
				if(i==player.getI() && j==player.getJ()) {
					System.out.print(player.getSymbol());
					if (j==4)
						System.out.println();
					continue;
				}
					
				System.out.print(map[i][j].getSymbol());
				if (j==4)
					System.out.println();
			}
		}
	}
	
	/**
	 * This is the setupMap method, which sets certain Rooms
	 * to have items, discoveries, and descriptions
	 * 
	 * @param unused
	 * @return nothing
	 */
	public static void setupMap() {
		map[0][1].setDescription("There is a sticky note stuck to a stick that says it's a stickler for sticky situations");
		map[0][1].setDiscovery("S");
		map[0][1].setItem("stick");
		map[3][3].setDescription("There is a stick sticking out of the ground");
		map[3][3].setDiscovery("S");
		map[3][3].setItem("stick");
		map[4][4].setDescription("There is a small part of a decayed fence that can constitute as a stick");
		map[4][4].setDiscovery("S");
		map[4][4].setItem("stick");
		map[1][2].setDescription("There is a partially destroyed house with cobweb cascading down from the ceiling");
		map[1][2].setDiscovery("C");
		map[1][2].setItem("string");
		map[2][0].setDescription("There is cobweb lining the edge of the spider den");
		map[2][0].setDiscovery("C");
		map[2][0].setItem("string");
		map[4][0].setDescription("There is a table that converts 2 string and 3 sticks to a fishing pole");
		map[4][0].setDiscovery("T");
		map[4][0].setItem("table");
	}
	
	/**
	 * This is the move method, which updates
	 * the 2d array of Rooms to reflect where the
	 * player has been 
	 * 
	 * @param String
	 * @return nothing
	 */
	public static void move(String a) {
		if (map[player.getI()][player.getJ()].getSymbol().equals("?"))
			map[player.getI()][player.getJ()].setSymbol("-");
		player.move(a);
		System.out.println(map[player.getI()][player.getJ()].getDescription());
		if (!map[player.getI()][player.getJ()].getDiscovery().equals(""))
			map[player.getI()][player.getJ()].setSymbol(map[player.getI()][player.getJ()].getDiscovery());
	}
	
	
}
