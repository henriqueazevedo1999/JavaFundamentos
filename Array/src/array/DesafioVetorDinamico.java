package array;

import java.util.Scanner;

public class DesafioVetorDinamico
{

    public static void main(String[] args)
    {
        boolean continues = true;
        int i = 0;
        String[] oldArray = new String[0];
        String[] newArray = null;

        while (continues)
        {
            newArray = new String[i + 1];
            for (int x = 0; x < oldArray.length; x++)
            {
                newArray[x] = oldArray[x];
            }
            System.out.print("Digite o " + (i + 1) + "° nome: ");

            newArray[i] = new Scanner(System.in).nextLine();
            oldArray = newArray;
            System.out.print("Deseja continuar (Y/N)? ");
            continues = new Scanner(System.in).nextLine().equalsIgnoreCase("Y");
            i++;
        }

        System.out.println();
        System.out.println("Nomes:");
        for (String name : newArray)
        {
            System.out.println(name);
        }
    }
}
