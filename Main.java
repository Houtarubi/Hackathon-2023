public class Main
{
    public static void main(String[] args)
    {
        String[][] b1 = {{"P","A","P","I"},
                    {"H","D","B","I"},
                    {"A","E","S","G"},
                    {"T","F","F","L"}};

        Solver s = new Solver(b1);

        System.out.println(s);
        //System.out.println(s.check("ATE"));
        s.fileTest();
    }
}
