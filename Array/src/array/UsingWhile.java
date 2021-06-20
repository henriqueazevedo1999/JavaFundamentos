package array;

import java.util.Scanner;

public class UsingWhile
{

    public static void main(String[] args)
    {
        String[] names = new String[4];
        int i = 0;
        while (i < names.length)
        {
            System.out.print("Informe o " + (i + 1) + "° nome: ");
            names[i] = new Scanner(System.in).nextLine();
            i++;
        }

        for (i = 0; i < names.length; i++)
        {
            System.out.println(names[i]);
        }
    }
}
