/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceitoclasse;

public class Pessoa
{

    String nome;
    int idade;
    double peso;
    double altura;

    public void CalculaIdade()
    {
        if (idade < 18)
        {
            System.out.println("Menor de idade");
        } else
        {
            System.out.println("Maior de idade");
        }
    }

    public void Display()
    {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        CalculaIdade();
        System.out.println("Peso: " + peso);
        System.out.println("IMC: " + String.format("%.2f", CalculaImc()));
        System.out.println("Análise IMC: " + VerificaIMC());
        System.out.println();
    }

    public double CalculaImc()
    {
        return (peso / Math.pow(altura, 2.0));
    }

    public String VerificaIMC()
    {
        double indice = CalculaImc();
        if (indice < 18.5)
        {
            return "Magreza";
        } else if (indice < 25)
        {
            return "Normal";
        } else if (indice < 30)
        {
            return "Sobrepeso";
        } else if (indice < 35)
        {
            return "Obesidade grau 1";
        } else if (indice < 40)
        {
            return "Obesidade grau 2";
        } else
        {
            return "Obesidade grau 3";
        }
    }
}
