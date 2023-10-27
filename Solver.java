import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class Solver 
{
    String[][] board;
    int count;
    int score;
    final Scanner file = new Scanner("test.txt");

    public Solver()
    {
        count = 0;
        score = 0;
        board = null;
        //file = new Scanner("dict.txt");
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
        while(file.hasNext())
        {
            String line = file.nextLine();
            System.out.println(line + count);
            count++;
        }
    }

}
