import java.io.*;
import java.util.Scanner;

public class player
{
    int move;
    int serial;
    char[] board;
    char name;
    Scanner in=new Scanner(System.in);
    public player(chessBoard b,char n)//从主棋盘获得自己的“小棋盘”,以及自己的名字n
    {
        name=n;
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
        if(board[move-1]=='X'||board[move-1]=='O')
            return 0;
        return 1;
    }

    public int go()//落子
    {
        int[] pos={7,8,9,4,5,6,1,2,3};
        System.out.println(name+"下在哪个位置？");
        while(true)
        {
            move=in.nextInt();
            move=pos[move-1];
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
