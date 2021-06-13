package parametros;

import java.util.ArrayList;

public class Calculadora
{
    public static int Somar(ArrayList<Integer> numeros)
    {
        int soma = 0;
        for (int num : numeros)
        {
            soma += num;
        }
        return soma;
    }
    
    public static int Subtrair(ArrayList<Integer> numeros)
    {
        int soma = 0;
        for (int num : numeros)
        {
            soma -= num;
        }
        return soma;
    }
    
    public static int Multiplicar(ArrayList<Integer> numeros)
    {
        int soma = 0;
        for (int num : numeros)
        {
            soma *= num;
        }
        return soma;
    }
    
    public static int Dividir(ArrayList<Integer> numeros)
    {
        int soma = 0;
        for (int num : numeros)
        {
            soma /= num;
        }
        return soma;
    }
}
