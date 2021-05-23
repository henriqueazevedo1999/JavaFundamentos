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
        String name = lerDadosTeclado("Informe seu nome: ");
        int idade = Integer.parseInt(lerDadosTeclado("Informe sua idade: "));
        int altura = Integer.parseInt(lerDadosTeclado("Informe sua altura em cm: "));
        double peso = Double.parseDouble(lerDadosTeclado("Informe seu peso em kg: "));
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
    
    public static void operadores()
    {
        
    }
}
