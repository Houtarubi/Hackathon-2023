import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Solver
{
    String[][] board;
    int count;
    int score;
    File f;
    Scanner file;

    public Solver() throws FileNotFoundException
    {
        count = 0;
        score = 0;
        board = null;
        f = new File("test.txt"); ///Users/wubbalubbadubdub/Downloads/WORDHUNT/test.txt
        file = new Scanner(f);
    }

    public Solver(String[][] b)
    {
        board = b;
    }

    public void startPos() // 16x
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
                struggle(i, j, 0, board[i][j]);
        }
    }

    public void struggle(int row, int col, int start, String rec)
    {

    }

    public boolean check(String x)  ////// this is not right
    {
        //String line = file.next();
        while (file.hasNext())
        {
            if (file.next().equals(x))
                return true;
        }

        return false;
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

    public void fileTest()
    {
        int count = 0;
        while(file.hasNextLine())
        {
            String line = file.nextLine();
            count++;
            System.out.println(line + count);
        }
    }

}
