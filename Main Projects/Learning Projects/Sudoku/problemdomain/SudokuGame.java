package JAVA.Projects.Sudoku.problemdomain;
//sudoku game
/*Keywords being used
 * private
 * final
 * this.
 * implements
 */
/*Structure
 * Game initialization (initializing the game state and the grid state)
 * 
 */
import java.io.Serializable;

public class SudokuGame implements Serializable{
    //initializing the sudoku grid and the game state (w/ hashing)
    private final GameState gameState;
    private final int[][]gridState;

    public static final GRID_BOUNDARY = 9;

    public SudokuGame(GameState gameState, int[][] gridState) {
        this.gameState = gameState;
        this.gridState = gridState;
    }
    public GameState getGameState() {
        return SudokuUtilities.copyToNewArray(gridState);
    }
}
