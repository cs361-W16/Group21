package models;

/**
 * Created by Devin on 1/21/2016.
 *
 * **INCOMPLETE**
 *  Merging so that Terrance has a copy of the game class
 *
 */
public class Game {
    private static int COL_NUM = 4;
    private static int ROW_NUM = 13;
    private String[][] board;
    private Deck deck = new Deck();

    public Game() {
        Card card = new Card();
        board = new String[ROW_NUM][COL_NUM];
        columnInitialized();
        deck.Make();
    }

    public int columnInitialized() {
        int count = 0;
        for (int i = 0; i < ROW_NUM; i++) {
            for (int j = 0; j < COL_NUM; j++) {
                board[i][j] = null;
                if (board[i][j] == null)
                    count = count + 1;
            }
        }
        if (count == 52)
            return 0;
        else
            return 1;
    }


    /**
     * @param  column it is the number of the column
     * @return bottom of column
     */
    public int getBottom(int column) {
        int count = 0;
        for (int i = 0; i < ROW_NUM; i++) {
            String j = board[i][column];
            if (j == null) {
                return count;
            }
            count++;
        }
        return count;
    }

    /**
     * Deals cards to the game board
     * @return
     */
    public int dealToBoard() {
        int count = 0;          //Checks to make sure that the game board is no longer empty
        int bottom;             //Bottom of the column
        Card card;               //Card to be moved to game card
        String gameCard;        //Card to be moved to the board

        for (int i = 0; i < COL_NUM; i++) {
            //Gets the bottom of all the columns in each for loop
            bottom = getBottom(i);

            //gets the card that will be distributed to the game board
            card = deck.Deal();

            //Gets the card the will be distributed to the game board
            gameCard = card.getCode();

            //puts the card into the game board
            board[bottom][i] = gameCard;

            if (board[bottom][i] != null) {
                count++;
            }
        }
        return count;
    }

    public void reset() {
        for (int i = 0; i < ROW_NUM; i++) {
            for (int j = 0; j < COL_NUM; j++) {
                board[i][j] = null;
            }
        }

        Deck deck = new Deck();
        deck.Make();
        deck.Shuffle();
    }
}

//Delete card from rowsa
/**    public void Delete(int colnum)
    {
        int bottom;
        if(colnum == 1 )
        {
            bottom = getBottom(0);
            board[bottom][colnum] =  null;
        }
    }*/

