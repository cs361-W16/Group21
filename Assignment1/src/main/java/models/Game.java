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
    private Deck deck;
    int columnCount;

    public Game() {
        Deck deck = new Deck();
        board = new String[ROW_NUM][COL_NUM];
        columnInitialized();
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
     * @param column
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


    //Delete card from columns
    public void Delete(int colnum) {

        int bottom;

        if (colnum == 0) {
            bottom = getBottom(colnum);
            board[bottom][colnum] = null;
        } else if (colnum == 1) {
            bottom = getBottom(colnum);
            board[bottom][colnum] = null;
        } else if (colnum == 2) {
            bottom = getBottom(colnum);
            board[bottom][colnum] = null;
        } else if (colnum == 3) {
            bottom = getBottom(colnum);
            board[bottom][colnum] = null;

        }


    }


}
