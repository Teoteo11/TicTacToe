import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {
        int numOfTurn = 0;
        String user = "X";

        //new object tris
        Tris gameOfTeo = new Tris();
        Scanner in = new Scanner(System.in);


        while(true)
        {
            // mossa user
            System.out.println(gameOfTeo.toString());
            System.out.print("Insert row" + user);
            System.out.println(" (-1 for exit): ");
            int posOfRow = in.nextInt();
            if (posOfRow < 0) return;
            System.out.print("Insert col" +user);
            System.out.println(" : ");
            int posOfCol= in.nextInt();

            // insert played
            gameOfTeo.played(posOfRow,posOfCol,user);

            // state of board
            System.out.println(gameOfTeo.tostring());

            // verify winner
            String verifica = gameOfTeo.winnerOfGame();
            if(verifica.equalsIgnoreCase("---USER X WIN---") || verifica.equalsIgnoreCase("---USER O WIN---"))
            {
                // game finish if user win
                System.out.println(verifica);
                return;
            }

            numOfTurn++;
            if(numOfTurn==9)
            {
                // tris full,not winner
                System.out.println("No winner");
                return;
            }

            // if play X,so play O. Else play X
            if(user=="X")
                user = "O";
            else
                user = "X";
        }

    }
}