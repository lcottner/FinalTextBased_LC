/**
* The Room program represents a room that the player enter and discover if
*there is anything of note
*
* @author  Lacey Cottner
* @version 1.0
* @since   2021-04-14 
*/
package main;

public class Room {
	private String symbol;
	private String item;
	private String description;
	private String discovery;
	
	/**
	* Default constructor 
	* @param unused
	*/
	public Room() {
	symbol="?";
	item="";
	description="There is nothing here";
	discovery="";
	}
	

	/**
	 * @return the discovery
	 */
	public String getDiscovery() {
		return discovery;
	}

	/**
	 * @param discovery the discovery to set
	 */
	public void setDiscovery(String discovery) {
		this.discovery = discovery;
	}

	/**
	 * @return the symbol
	 */
	public String getSymbol() {
		return symbol;
	}

	/**
	 * @param symbol the symbol to set
	 */
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	/**
	 * @return the item
	 */
	public String getItem() {
		return item;
	}

	/**
	 * @param item the item to set
	 */
	public void setItem(String item) {
		this.item = item;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
