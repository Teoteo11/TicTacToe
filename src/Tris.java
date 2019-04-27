public class Tris
{
    private String[][] gameBoard; //char esplodeva
    private static final int row = 3;
    private static final int col = 3;

    //create empty board 3x3
    public Tris()
    {
        gameBoard = new String[row][col];
        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++)
            {
                gameBoard[i][j] = " ";
            }
    }

    // state of gameBoard
    public String tostring()
    {
        String state = "";
        for(int i=0; i<row; i++)
        {
            state += " | ";
            for (int j=0;j<col;j++)
                state+= gameBoard[i][j];
            state+= "| \n";
        }
        return state;
    }

    // insert of played
    public void played(int i, int j, String user)
    {
        if(gameBoard[i][j]!=" ")
        {
            throw new IllegalArgumentException("Position already used");
        }
        gameBoard[i][j] = user;
    }

    // method for the winner
    public String winnerOfGame()
    {
        int m=0;
        int n=0;
        //riga
        for(int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                if(gameBoard[i][j]=="X")
                {
                    m++;
                    if(m==3)
                    {
                        return "---USER X WIN---";
                    }
                }
                else
                {
                    if(gameBoard[i][j]=="O")
                    {
                        n++;
                        if(n==3)
                        {
                            return "---USER O WIN---";
                        }
                    }
                }
            }
            m=0;
            n=0;
        }
        // colonna
        for(int i=0;i<col;i++)
        {
            for (int j=0;j<row;j++)
            {
                if(gameBoard[j][i]=="X")
                {
                    m++;
                    if(m==3)
                    {
                        return "---USER X WIN---";
                    }
                }
                else
                {
                    if(gameBoard[j][i]=="O")
                    {
                        n++;
                        if(n==3)
                        {
                            return "---USER O WIN---";
                        }
                    }
                }
            }
            m=0;
            n=0;
        }

        // diagonale
        for(int i=0;i<row;i++)
        {
            int j = i;
            if(gameBoard[i][j]=="X")
            {
                m++;
                if(m==3)
                {
                    return "---USER X WIN---";
                }
            }
            else
            {
                if(gameBoard[i][j]=="O")
                {
                    n++;
                    if(n==3)
                    {
                        return "---USER O WIN---";
                    }
                }
            }
        }
        m=0;
        n=0;
        int j = 2;
        for(int i=0;i<row;i++)
        {
            if(gameBoard[i][j]=="X")
            {
                m++;
                if(m==3)
                {
                    return "---USER X WIN---";
                }
            }
            else
            {
                if(gameBoard[i][j]=="O")
                {
                    n++;
                    if(n==3)
                    {
                        return "---USER O WIN---";
                    }
                }
            }
            j--;
        }
        return "" ;
    }


}