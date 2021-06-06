/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaconceitos;

import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;
import java.text.ParseException;

/**
 *
 * @author 70726
 */
public class AulaConceitos
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
//        int altura = Integer.parseInt(lerDadosTeclado("Informe sua altura em cm: "));
//        double peso = Double.parseDouble(lerDadosTeclado("Informe seu peso em kg: "));
//        System.out.print("Insira x: ");
//        double x = Double.parseDouble(tela.nextLine());
//        System.out.print("Insira y: ");
//        double y = Double.parseDouble(tela.nextLine());
//        System.out.print("Insira z: ");
//        double z = Double.parseDouble(tela.nextLine());
//
//        operadoresMatematicos(x, y);
//        operadoresComparacao(x, y);
//        operadoresLogicos(x, y, z);

        String name = lerDadosTeclado("Informe o nome: ");;
        int age = Integer.parseInt(lerDadosTeclado("Informe a idade: "));
        System.out.println();
        System.out.println("Nome: " + name);
        System.out.println("Situação: " + verificaIdade(age));
    }

    public static String lerDadosTeclado(String message)
    {
        Scanner tela = new Scanner(System.in);
        System.out.print(message);
        return tela.nextLine();
    }

    public static void declaracaoVariavel()
    {
        char sexo = 'F';
        String Name = "Henrique";
        int idade = 10;
        double peso = 10.5;
        float altura = (float) 1.69;
    }

    public static void operadoresMatematicos(double x, double y)
    {
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x % y = " + (x % y));
    }

    public static void operadoresComparacao(double x, double y)
    {
        System.out.println("x == y? " + (x == y));
        System.out.println("x != y? " + (x != y));
        System.out.println("x >= y? " + (x >= y));
        System.out.println("x > y? " + (x > y));
        System.out.println("x <= y? " + (x <= y));
        System.out.println("x < y? " + (x < y));
    }

    public static void operadoresLogicos(double x, double y, double z)
    {
        System.out.println("x < y and x < z? " + ((x < y) && (x < z)));
        System.out.println("x < y and x > z? " + ((x < y) && (x > z)));
        System.out.println("x > y and x < z? " + ((x > y) && (x < z)));
        System.out.println("x > y and x > z? " + ((x > y) && (x > z)));
    }

    public static void desvioCondicional(double x, double y)
    {
        if (x < y)
        {
            System.out.println("x < y!");
        } else if (x > y)
        {
            System.out.println("x > y!");
        } else if (x == y)
        {
            System.out.println("x = y!");
        }
    }

    public static String verificaIdade(int idade)
    {
        if (idade <= 10)
        {
            return TipoIdade.Crianca.toString();
        } else if (idade < 15)
        {
            return TipoIdade.Pre_Adolescente.toString();
        } else if (idade < 18)
        {
            return TipoIdade.Adolescente.toString();
        } else if (idade < 50)
        {
            return TipoIdade.Adulto.toString();
        }
        return TipoIdade.Terceira_Idade.toString();
    }
}
