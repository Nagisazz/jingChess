import java.io.*;

public class jingChess
{
    public static void main(String[] args)
    {
        char[] testBoard={' ','X','O','O','X','X','O',' ',' '};
        chessBoard cbOne=new chessBoard(testBoard);
        cbOne.display();
        char[] tbTwo={'X','O','O','O','X',' ',' ',' ','X'};
        cbOne.setBoard(tbTwo);
        cbOne.display();
        if(cbOne.isWin()==1)
        {
            System.out.println("the winner is "+cbOne.winner);
        }
    }
}
