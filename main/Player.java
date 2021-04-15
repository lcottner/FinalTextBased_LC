/**
* The Player program represents a Player that can 
* move around the world
*
* @author  Lacey Cottner
* @version 1.0
* @since   2021-04-14 
*/
package main;

public class Player {
	private final String symbol="P";
	private String [] [] location=new String [5] [5];
	private int i;
	private int j;
	
	/**
	* Default constructor 
	* @param unused
	*/
	public Player() {
		i=2;
		j=2;
		location[i][j]=symbol;
	}
	
	/**
	 * This is the move method, which updates
	 * the players location in the world. It is called when the command
	 * "move (direction)" is entered.
	 * 
	 * @param String
	 * @return nothing
	 */
	public void move(String a) {
		//OutOfBoundsException e=new OutOfBoundsException("You cannot proceed further");
		try {
		if (a.equals("north")) {
			if (i==0)
				throw new OutOfBoundsException("");
			i--;
		}
		if (a.equals("south")) {
			if (i==4)
				throw new OutOfBoundsException("");
			i++;
		}
			
		if (a.equals("west")) {
			if (j==0)
				throw new OutOfBoundsException("");
			j--;
		}
		if (a.equals("east")) {
			if (j==4)
				throw new OutOfBoundsException("");
			j++;
		}
		
		location[i][j]=symbol;
		}
		catch (OutOfBoundsException e) {
			System.out.println("You cannot proceed in that direction any further");
		}
	}
	
	/**
	 * @return the i
	 */
	public int getI() {
		return i;
	}

	/**
	 * @param i the i to set
	 */
	public void setI(int i) {
		this.i = i;
	}

	/**
	 * @return the j
	 */
	public int getJ() {
		return j;
	}

	/**
	 * @param j the j to set
	 */
	public void setJ(int j) {
		this.j = j;
	}
	
	/**
	 * @return the symbol
	 */
	public String getSymbol() {
		return symbol;
	}
	
	
	
}
