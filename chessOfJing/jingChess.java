import java.io.*;

public class jingChess
{
    public static void main(String[] args)
    {
        chessBoard cb=new chessBoard();
        player playerX=new player(cb);
        player playerO=new player(cb);
        int count=0;
        int m;
        while(true)
        {
            if(count%2==0)
            {
                playerX.updateBoard(cb);
                m=playerX.go();
                cb.setNewMove(m,'X');
                cb.display();
                if(cb.isWin()==1)
                {
                    System.out.print(cb.getWinner());
                    break;
                }
            }
            else
            {
                playerO.updateBoard(cb);
                m=playerO.go();
                cb.setNewMove(m,'O');
                cb.display();
                if(cb.isWin()==1)
                {
                    System.out.println("the winner is "+cb.getWinner());
                    break;
                }

            }
            count++;
            if(count==9) 
            {
                System.out.println("call it a draw");
            }
            
        }

    }
}
