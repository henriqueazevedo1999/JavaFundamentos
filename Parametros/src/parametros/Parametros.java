package parametros;

import java.util.ArrayList;
import java.util.Scanner;

public class Parametros
{

    public static void main(String[] args)
    {
        int numCnt = 0;
        int operacao = 0;
        int resultado = 0;
        boolean continua = true;

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        while (continua == true)
        {
            numCnt += 1;
            System.out.print("Insira o " + numCnt + "° número: ");
            //String numeroString = scanner.nextLine();
            int numero = scanner.nextInt();
            //numeros.add(Integer.parseInt());
            System.out.print("Deseja inserir mais algum número? (Y/N) ");
            continua = scanner.nextLine().equalsIgnoreCase("N");
        }

        while ((operacao >= 1) && (operacao <= 4))
        {
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Subtração");
            System.out.println("Digite o número da operação a ser realizada: ");
            operacao = scanner.nextInt();

            switch (operacao)
            {
                case 1:
                    resultado = Calculadora.Somar(numeros);
                    break;
                case 2:
                    resultado = Calculadora.Subtrair(numeros);
                    break;
                case 3:
                    resultado = Calculadora.Multiplicar(numeros);
                    break;
                case 4:
                    resultado = Calculadora.Dividir(numeros);
                    break;
                default:
                    System.out.println("Operação inválida!");
                    break;
            }
        }
        System.out.println(String.format("%.4f", resultado));
    }
}
