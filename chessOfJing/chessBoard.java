import java.io.*;


public class chessBoard
{
    char[] cb=new char[9];//cb=chess board
    int newMove;
    int winornot;
    int serial;
    char winner;
    public chessBoard(char[] boc)//带棋局初始化
    {
        for(int i=0;i<9;i++)
        {
            cb[i]=boc[i];
        }
        winner=' ';
        winornot=0;
        serial=0;
        newMove=9;
    }
    public chessBoard()//无参初始化
    {
        for(int i=0;i<9;i++)
        {
            cb[i]=' ';
        }
        winner=' ';
        winornot=0;
        serial=0;
        newMove=9;
    }
    public void setBoard(char[] boc)//设定棋局
    {
         for(int i=0;i<9;i++)
        {
            cb[i]=boc[i];
        }
    }
    public char[] getBoard()
    {
        return cb;
    }
    public void setNewMove(int nm,char p)//记录最新一步
    {
        newMove=nm;
        cb[nm-1]=p;
    }
    public void setSerial(int number)//设定棋盘序号
    {
        serial=number;
    }
    public int getSerial()
    {
        return serial;
    }
    public char getWinner()
    {
        return winner;
    }
    public void display()//
    {
        System.out.print("\n");
        for(int i=1;i<=9;i++)
        {
            if(i!=newMove)
            System.out.print(cb[i-1]);
            else
            {
                System.out.print("\u001B[34m"+cb[i-1]+"\u001B[0m");
            }
            if(i%3!=0)
                System.out.print("|");
            if((i%3==0)&&(i!=9))
                System.out.print("\n------\n");
        }
        System.out.print("\n\n");

    }
    public int isWin()//判胜负
    {
        char[] rotate90Cb={cb[6],cb[3],cb[0],cb[7],cb[4],cb[1],cb[8],cb[5],cb[2]};
        int count=0;
        int isWin=0;
        //chess board check
        for(int i=0;i<9;i+=3)
        {
            if((cb[i]==cb[i+1]&&cb[i+1]==cb[i+2])
                    &&(cb[i]!=' '))
            {
                isWin=1;
                winner=cb[i];
            }
        }

        if(isWin==1)
        {
            winornot=isWin;
            return isWin;
        }

        if((cb[0]==cb[4]&&cb[4]==cb[8])&&(cb[0]!=' '))
        {
            isWin=1;
            winner=cb[0];
        }

        if(isWin==1)
        {
            winornot=isWin;
            return isWin;
        }

        //rotate 90degree chess board check
        for(int i=0;i<9;i+=3)
        {
            if((rotate90Cb[i]==rotate90Cb[i+1]&&rotate90Cb[i+1]==rotate90Cb[i+2])
                    &&(rotate90Cb[i]!=' '))
            {
                isWin=1;
                winner=rotate90Cb[i];
            }
        }

        if(isWin==1)
        {
            winornot=isWin;
            return isWin;
        }

        if((rotate90Cb[0]==rotate90Cb[4]&&rotate90Cb[4]==rotate90Cb[8])
                &&(rotate90Cb[0]!=' '))
        {
            isWin=1;
            winner=rotate90Cb[0];
        }

        winornot=isWin;
        return isWin;
    }
}
