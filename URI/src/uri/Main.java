package uri;
import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException 
    {
        long casosTeste = 0;
        String rato = "R";
        String coelho = "C";
        String sapo = "S";
        
        long quantidade = 0;
        String animal = "";
        
        long ratos = 0;
        long sapos = 0;
        long coelhos = 0;
        double total = 0.0;
        
        casosTeste = new Scanner(System.in).nextLong();
        
        for (int controle = 1; controle <= casosTeste; controle++)
        {
            quantidade = new Scanner(System.in).nextLong();
            animal = new Scanner(System.in).next();
            
            total += quantidade;
            
            if (animal.equals(sapo))
                sapos += quantidade;
            if (animal.equals(rato))
                ratos += quantidade;
            if (animal.equals(coelho))
                coelhos += quantidade;
        }
        System.out.println("Total: " + (int) total + " cobaias");
        System.out.println("Total de coelhos: " + coelhos);
        System.out.println("Total de ratos: " + ratos);
        System.out.println("Total de sapos: " + sapos);
        System.out.println("Percentual de coelhos: " + String.format("%.2f", ((coelhos / total) * 100)) + " %");
        System.out.println("Percentual de ratos: " + String.format("%.2f", ((ratos / total) * 100)) + " %");
        System.out.println("Percentual de sapos: " + String.format("%.2f", ((sapos / total) * 100)) + " %");
    }
}