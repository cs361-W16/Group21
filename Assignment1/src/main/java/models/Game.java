package models;

/**
 * Created by Devin on 1/21/2016.
 *
 * **INCOMPLETE**
 *  Merging so that Terrance has a copy of the game class
 *
 */
public class Game {
    private static int COL_NUM = 13;
    private String[] columnOne;
    private Deck deck;
    int columnCount;

    Game() {
        Deck deck = new Deck();
        columnOne = new String[COL_NUM];
    }

    //initialize column one
    public int columnInitialized() {
        int count = 0;
        for (int i = 0; i < COL_NUM; i++) {
            columnOne[i] = "";
            if (columnOne[i] == "")
                count = count + 1;
        }
        if (count == 13)
            return 0;
        else
            return 1;
    }
//Delete card from rowsa
    public void Delete(int colnum)
    {
        int button;
        if(colnum == 1 )
        {
            botton = getBottom(columnOne);
            board[bottom][colnum] =  null;
        }
    }
}
