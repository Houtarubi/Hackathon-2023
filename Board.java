public class Board
{
    public String[][] board;

    Board()
    {
        board = new String[4][4];
    }

    public Board(String[][] board)
    {
        this.board = board; 
    }

    public String getChar(int r, int c)
    {
        return board[r][c];
    }

    public String toString()
    {
        String out = "";
        for (String[] x : board)
        {
            out += "| ";
            for (String y : x)
                out += y + " ";
            out += "|" + "\n"; 
        }
        return out;
    }
}
