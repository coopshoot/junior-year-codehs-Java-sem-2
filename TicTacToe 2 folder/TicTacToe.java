public class TicTacToe
{
   //copy over your constructor from the Tic Tac Toe Board activity in the previous lesson!
   private int turn;
   private String[][] board;
   
    public TicTacToe()
    {
        String[][] tic = {{"-","-","-",},{"-","-","-",},{"-","-","-",}};
        this.board = tic;
    }
    
    public String[][] getBoard()
    {
        return board;
    }
    
   //this method returns the current turn
   public int getTurn()
   {
       return turn;
   }
   
   /*This method prints out the board array on to the console
   */
   public void printBoard()
   {
       System.out.println("  0 1 2");
       for(int i = 0; i < board.length; i++)
       {
           System.out.print(i + " ");
           for(int j = 0; j < board[i].length;j++)
           {
               System.out.print(board[i][j] + " ");
               
           }
           System.out.println();
       }
   }
   
   //This method returns true if space row, col is a valid space
   public boolean pickLocation(int row, int col)
   {
       if(board[row][col].equals("-"))
       {
           return true;
       }
       return false;
   }
   
   //This method places an X or O at location row,col based on the int turn
   public void takeTurn(int row, int col)
   {
       if(turn % 2 == 0)
       {
           board[row][col] = "X";
           turn++;
       }
       else if (turn % 2 != 0)
       {
           board[row][col] = "O";
           turn++;
       }
   }
   
   //This method returns a boolean that returns true if a row has three X or O's in a row
   public boolean checkRow()
   {
       for(int i = 0; i < board.length; i++)
       {
           if(board[i][0].equals("X") && board[i][1].equals("X") && board[i][2].equals("X"))
           {
               return true;
           }
           else if(board[i][0].equals("O") && board[i][1].equals("O") && board[i][2].equals("O"))
           {
               return true;
           }
       }
       return false;
   }
   
    //This method returns a boolean that returns true if a col has three X or O's
   public boolean checkCol()
   {
       for (int row = 0; row < board.length; row++) {
           int x = 0;
           int o = 0;
           for (int col = 0; col < board[row].length; col++) {
               if (board[col][row].equals("X")) {
                   x++;
               }
               if (board[col][row].equals("O")) {
                   o++;
               }
           }
           if (x == 3 || o == 3) {
               return true;
           }
       }
       return false;
   }
   
    //This method returns a boolean that returns true if either diagonal has three X or O's
   public boolean checkDiag()
   {
       if((board[0][0].equals("X") && board[1][1].equals("X") && board[2][2].equals("X")) || (board[0][2].equals("X") && board[1][1].equals("X") && board[2][0].equals("X")))
       {
           return true;
       }
       else if ((board[0][0].equals("O") && board[1][1].equals("O") && board[2][2].equals("O")) || (board[0][2].equals("O") && board[1][1].equals("O") && board[2][0].equals("O")))
       {
           return true;
       }
       return false;
   }
   
   //This method returns a boolean that checks if someone has won the game
   public boolean checkWin()
   {
       if((checkDiag() || checkCol() || checkRow()) == true)
       {
           return true;
       }
       return false;
   }

}
