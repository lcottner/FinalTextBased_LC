/**
* The GameApplication program implements an application to set
* up the game and allow the user to play it
*
* @author  Lacey Cottner
* @version 1.0
* @since   2021-04-14 
*/
package main;

public class GameApplication {
	/**
	   * This is the main method which sets up the game and
	   * allows the user to play the game
	   * 
	   * @param args Unused
	   * @return Nothing
	   */
	public static void main (String[]args) {
		Parser pars=new Parser();
		Map.createRoom();
		Map.setupMap();
		
		System.out.println("You are standing at a small lake swarming with fish");
		System.out.println("It would be in your best interest to find a fishing pole");
		System.out.println("Perhaps you should look around for materials");
		
		System.out.println("---------------------");
		System.out.println("Type help to get a list of commands");
		System.out.println("---------------------");
		
		while (Map.win()==false) {
		pars.scan();
		}
		
		System.out.println("Congratulations! You've made a fishing pole and completed the game!");
	}
}
