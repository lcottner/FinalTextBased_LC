/**
* The Parser program represents a parser that can
* determine what the user has entered and transfer them into the game
*
* @author  Lacey Cottner
* @version 1.0
* @since   2021-04-14 
*/
package main;
import java.util.Scanner;

public class Parser {
	private Scanner scan=new Scanner(System.in);
	private String placeholder;
	private String first;
	private String second;
	
	/**
	 * This is the scan method, which asks the user to
	 * enter a command and then acts accordingly
	 * 
	 * @param unused
	 * @return nothing
	 */
	public void scan(){
	System.out.println("Enter your command");
	placeholder=scan.nextLine();
	
	if (placeholder.indexOf(' ')!=-1){
	
	first=placeholder.substring(0,placeholder.indexOf(' '));
	second=placeholder.substring(placeholder.indexOf(' ')+1,placeholder.length());
	
	
	if (first.equals("move"))
		Map.move(second);
	else {
		if (first.equals("get"))
			Map.get(second);
		else {
 
			if (first.equals("use"))
				Map.use(second);
			else
				System.out.println("Command not recognized. Type help for a list of commands");
		}
	}
	
	}
	
	else
		//if =="map" map();
		if (placeholder.equals("map"))
			Map.displayMap();
	
		else {
		if (placeholder.equals("help"))
			help();
		else {
			if (placeholder.equals("inventory"))
				Item.inventory();
			else
				System.out.println("Command not recognized. Type help for a list of commands");
			}
		}
	}
	
	/**
	 * This is the help method, which prints out what commands can
	 * be entered into the terminal
	 * 
	 * @param unused
	 * @return nothing
	 */
	public static void help() {
		System.out.println("Commands");
		System.out.println("--------");
		System.out.println("move (north,south,east,west): Move the player in a given direction");
		System.out.println("get (cobweb, stick): Take what is in the room and add it to the inventory");
		System.out.println("use table: Make something out of current materials");
		System.out.println("map: Brings up a display where the player currently is ");
		System.out.println("inventory: Shows what is currently in the player's possession");
	}
}
