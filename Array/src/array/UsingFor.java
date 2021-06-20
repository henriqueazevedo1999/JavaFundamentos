package array;

import java.util.Scanner;

public class UsingFor
{

    public static void main(String[] args)
    {
        String[] names = new String[4];
        for (int i = 0; i < names.length; i++)
        {
            System.out.print("Digite o " + (i + 1) + "° nome: ");
            names[i] = new Scanner(System.in).nextLine();
        }
        
        System.out.println();
        System.out.println("Nomes:");
        
        for (String name : names)
        {
            System.out.println(name);
        }
    }

}
