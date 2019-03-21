import java.io.*;
import java.util.Scanner;

public class player
{
    int move;
    int serial;
    char[] board;
    Scanner in=new Scanner(System.in);
    public player(chessBoard b)//从主棋盘获得自己的“小棋盘”
    {
        board=b.getBoard();
        serial=b.getSerial();
    }
    public void updateBoard(chessBoard b)
    {
        board=b.getBoard();
        serial=b.getSerial();
    }
    private int legalMove()//判断可不可走
    {
        if(move>9||move<=0) return 0;
        if(board[move-1]!=' ')
            return 0;
        return 1;
    }
    public int go()//落子
    {
        char[] pos={'1','2','3','4','5','6','7','8','9'};
        System.out.println("下在哪个位置？");
        for(int i=1;i<=9;i++)
        {
            System.out.print(pos[i-1]);
            if(i%3!=0)
                System.out.print("|");
            if((i%3==0)&&(i!=9))
                System.out.print("\n------\n");
        }

        System.out.print("\n");

        while(true)
        {
            move=in.nextInt();
            if(0==legalMove())
            {
                System.out.print("不合法，请重选\n");
            }
            else
            {
                break;
            }
        }
        return move;
    }
}
