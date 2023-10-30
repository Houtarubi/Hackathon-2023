import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class WordHunt
{
    private Solver s;
    private Board board;
    public static void main(String[] args)
    {
        WordHunt wh = new WordHunt();
        System.out.println(wh.fileReader("test.txt"));
    }

    private String fileReader(String fn) // let para be Image x // supposed to b void
    {
        String out = "";
        try (Scanner scnr = new Scanner(new File(fn)))
        {
            char[][] b = new char[4][4];
            for (int i = 0; i < 4; i++)
            {
                String line = scnr.nextLine();
                for (int j = 0; j < 4; j++)
                {
                    b[i][j] = line.charAt(j);
                }
            }
            board = new Board(b);
            out = board.toString();
            System.out.println("File loaded successfully!");
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        return out;
    }

    // public File textExtractor(Image x)
    // {
    //     File out;
        
    //     return out;
    // }
}
