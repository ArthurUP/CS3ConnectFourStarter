/* CS3 Project 2 Connect Four Player interface */
package connectFour;

public interface Player {
	/**
	 * Gets the column index for the player's chosen move in the given grid.  Does not actually move.
	 * 
	 * Precondition: g represents a valid game in progress, so player has at least one valid move.
	 *
	 * Postcondition: The state of g is unchanged.  You may of course inspect the entire grid with the
	 * getPlayerAt method of g, and make a copy of that data to help "look ahead" when choosing your move.
	 * 
	 * Note: Since g represents a valid game, you can figure out your own player number just by counting
	 * the number of nonempty cells in g: if that number is even, you are player 1, otherwise you are player 2.
	 * 
	 * @param g  the game grid
	 * @return   the column index for this player's chosen move
	 */
	public int getMoveColumn(Grid g);
	
	/**
	 * Returns the name of the player.
	 * The player name should include your own name, like "Arthur's Confused Connector"
	 * 
	 * @return  player's name
	 */
	public String getPlayerName();
}
