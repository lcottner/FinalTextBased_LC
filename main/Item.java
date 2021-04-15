/**
* The Item program represents the items that the player 
* collects during their journey.
*
* @author  Lacey Cottner
* @version 1.0
* @since   2021-04-14 
*/
package main;

public class Item {
	private static int stick;
	private static int string;
	private static boolean fishing;
	
	/**
	* Default constructor 
	* @param unused
	*/
	public Item() {
		stick=0;
		string=0;
		fishing=false;
	}
	
	/**
	 * This is the inventory method, which prints out what the player
	 * currently has in their possession
	 * @param unused
	 * @return nothing
	 */
	public static void inventory() {
		if (stick==0 && string==0 && fishing==false)
			System.out.println("You currently do not have anything");
		else
			System.out.println("You have: ");
		if (stick!=0)
			System.out.println(stick + " stick");
		if (string!=0)
			System.out.println(string + " string");
		if (fishing==true)
			System.out.println("A fishing rod");
	}
	
	/**
	 * @return the stick
	 */
	public int getStick() {
		return stick;
	}
	/**
	 * @param stick the stick to set
	 */
	public void setStick(int stick) {
		this.stick = stick;
	}
	/**
	 * @return the string
	 */
	public int getString() {
		return string;
	}
	/**
	 * @param string the string to set
	 */
	public void setString(int string) {
		this.string = string;
	}
	/**
	 * @return the fishing
	 */
	public boolean isFishing() {
		return fishing;
	}
	/**
	 * @param fishing the fishing to set
	 */
	public void setFishing(boolean fishing) {
		this.fishing = fishing;
	}
	
	
	
}
