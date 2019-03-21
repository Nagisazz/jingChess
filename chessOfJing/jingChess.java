import java.io.*;

public class jingChess
{
    
    public static void clearScreen()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void main(String[] args)
    {
        chessBoard cb=new chessBoard();
        player playerX=new player(cb,'X');
        player playerO=new player(cb,'O');

        int count=0;
        int m;
        while(true)
        {
            clearScreen();
            if(count%2==0)
            {
                
                playerX.updateBoard(cb);
                cb.display();
                m=playerX.go();
                cb.setNewMove(m,'X');
                if(cb.isWin()==1)
                {
                    clearScreen();
                    cb.display();
                    System.out.println("the winner is "+cb.getWinner());
                    break;
                }
            }
            else
            {
                playerO.updateBoard(cb);
                cb.display();
                m=playerO.go();
                cb.setNewMove(m,'O');
                if(cb.isWin()==1)
                {
                    clearScreen();
                    cb.display();
                    System.out.println("the winner is "+cb.getWinner());
                    break;
                }

            }
            count++;
            if(count==9) 
            {
                System.out.println("call it a draw");
                break;
            }
            
        }

    }
}
