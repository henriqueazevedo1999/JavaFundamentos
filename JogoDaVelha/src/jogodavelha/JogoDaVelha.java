package jogodavelha;

import java.util.Random;
import java.util.Scanner;

public class JogoDaVelha
{

    public static String[][] jogo =
    {
        {
            " ", " ", " "
        },
        {
            " ", " ", " "
        },
        {
            " ", " ", " "
        }
    };

    public static void main(String[] args)
    {

        String winner = "";

        while (winner.equals(""))
        {
            boolean validPosition = false;
            while (validPosition == false)
            {
                System.out.print("Jogador - digite a posição: X, Y: ");
                String[] position = new Scanner(System.in).nextLine().toString().replace(" ", "").split(",");
                int x = Integer.parseInt(position[0]);
                int y = Integer.parseInt(position[1]);
                validPosition = PlayPosition(x, y, "X");
                if (!validPosition)
                {
                    System.out.println("Posição inválida!");
                }
            }

            winner = GetWinner(jogo);
            if (!winner.equals(""))
            {
                if (winner.equals("User"))
                {
                    System.out.println("Parabéns, você venceu!");
                } else if (winner.equals("Computer"))
                {
                    System.out.println("O computador ganhou!");
                } else if (winner.equals("Tied"))
                {
                    System.out.println("Empate!");
                }
                break;
            }
            validPosition = false;
            while (validPosition == false)
            {
                int x = new Random().nextInt(3);
                int y = new Random().nextInt(3);
                validPosition = PlayPosition(x, y, "O");
            }

            winner = GetWinner(jogo);
            if (!winner.equals(""))
            {
                if (winner.equals("User"))
                {
                    System.out.println("Parabéns, você venceu!");
                } else if (winner.equals("Computer"))
                {
                    System.out.println("O computador ganhou!");
                } else if (winner.equals("Tied"))
                {
                    System.out.println("Empate!");
                }
                break;
            }
        }
    }

    public static boolean PlayPosition(int x, int y, String character)
    {
        if ((x < jogo.length) && (y < jogo[x].length) && (jogo[x][y] == " "))
        {
            jogo[x][y] = character;
            PrintMatrix(jogo);
            return true;
        }
        return false;
    }

    public static void PrintMatrix(String[][] game)
    {
        System.out.println("----------------------------------------------");
        System.out.println("|" + game[0][0] + "|" + game[0][1] + "|" + game[0][2] + "|");
        System.out.println("|" + game[1][0] + "|" + game[1][1] + "|" + game[1][2] + "|");
        System.out.println("|" + game[2][0] + "|" + game[2][1] + "|" + game[2][2] + "|");
        System.out.println("----------------------------------------------");
    }

    public static String GetWinner(String[][] game)
    {
        String winner = "";

        winner = HorizontalTest(game, 0);
        if (!winner.equals(""))
        {
            return winner;
        }
        winner = HorizontalTest(game, 1);
        if (!winner.equals(""))
        {
            return winner;
        }
        winner = HorizontalTest(game, 2);
        if (!winner.equals(""))
        {
            return winner;
        }

        winner = VerticalTest(game, 0);
        if (!winner.equals(""))
        {
            return winner;
        }

        winner = VerticalTest(game, 1);
        if (!winner.equals(""))
        {
            return winner;
        }

        winner = VerticalTest(game, 2);
        if (!winner.equals(""))
        {
            return winner;
        }

        winner = XTest(game);
        if (!winner.equals(""))
        {
            return winner;
        }
        boolean tied = true;
        for (int i = 0; i < game.length; i++)
        {
            for (int j = 0; j < game[i].length; j++)
            {
                if (game[i][j].equals(" "))
                {
                    tied = false;
                    break;
                }
            }
            if (!tied)
            {
                break;
            }
        }
        if (tied)
        {
            return "Tied";
        }
        return "";
    }

    public static String HorizontalTest(String[][] game, int row)
    {
        if ((game[row][0].equals("X")) && (game[row][1].equals("X")) && (game[row][2].equals("X")))
        {
            return "User";
        } else if ((game[row][0].equals("O")) && (game[row][1].equals("O")) && (game[row][2].equals("O")))
        {
            return "Computer";
        }
        return "";
    }

    public static String VerticalTest(String[][] game, int column)
    {
        if ((game[0][column].equals("X")) && (game[1][column].equals("X")) && (game[2][column].equals("X")))
        {
            return "User";
        } else if ((game[0][column].equals("O")) && (game[1][column].equals("O")) && (game[2][column].equals("O")))
        {
            return "Computer";
        }
        return "";
    }

    public static String XTest(String[][] game)
    {
        if ((game[0][0].equals("X")) && (game[1][1].equals("X")) && (game[2][2].equals("X")))
        {
            return "User";
        } else if ((game[0][0].equals("O")) && (game[1][1].equals("O")) && (game[2][2].equals("O")))
        {
            return "Computer";
        }
         if ((game[0][2].equals("X")) && (game[1][1].equals("X")) && (game[2][0].equals("X")))
        {
            return "User";
        } else if ((game[0][2].equals("O")) && (game[1][1].equals("O")) && (game[2][0].equals("O")))
        {
            return "Computer";
        }
        return "";
    }
}