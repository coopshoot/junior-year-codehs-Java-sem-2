public class ChessBoard
{
    public static void main(String[] args)
    {
        //Create an 8x8 2D String array called chess.
        String[] first = {"Rook", "Knight", "Bishop", "Queen", "King", "Bishop", "Knight", "Rook"};
        String[] pawn = {"Pawn", "Pawn", "Pawn", "Pawn", "Pawn", "Pawn", "Pawn", "Pawn",};
        String[] dash = {"-", "-", "-", "-", "-", "-", "-", "-",};
        String[][] chess = new String[8][8];
        chess[0] = first;
        chess[1] = pawn;
        chess[2] = dash;
        chess[3] = dash;
        chess[4] = dash;
        chess[5] = dash;
        chess[6] = pawn;
        chess[7] = first;
        
       
        
        //Use this method to print the chess board onto the console
        print(chess);
        

    }
    
    //Do not make alterations to this method!
    public static void print(String[][] array)
    {
        for(String[] row: array)
        {
            for(String thing: row)
            {
                System.out.print(thing + "\t");
            }
            System.out.println();
        }
    }
}
