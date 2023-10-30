public class Board
{
    public char[][] board;

    Board()
    {
        board = new char[4][4];
    }

    public Board(char[][] board)
    {
        this.board = board; 
    }

    public char getChar(int r, int c)
    {
        return board[r][c];
    }

    public char[][] getBoard()
    {
        return board;
    }

    public String toString()
    {
        String out = "";
        for (char[] x : board)
        {
            out += "| ";
            for (char y : x)
                out += y + " ";
            out += "|" + "\n"; 
        }
        return out;
    }
}
