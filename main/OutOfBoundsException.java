/**
* The OutOfBoundsException program represents an error
* where the player has attempted to go beyond the arrays capabilities
*
* @author  Lacey Cottner
* @version 1.0
* @since   2021-04-14 
*/
package main;

public class OutOfBoundsException extends Exception{
	public OutOfBoundsException(String message) {
		super(message);
	}
	
}
