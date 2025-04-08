public class TicTacToe
{
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
    
}
