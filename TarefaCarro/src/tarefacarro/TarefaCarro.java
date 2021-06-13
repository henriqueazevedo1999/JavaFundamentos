package tarefacarro;

import java.util.Scanner;

public class TarefaCarro
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira a placa do carro: ");
        String placa = scanner.nextLine();
        Carro carro = new Carro(placa);

        System.out.print("Insira o modelo: ");
        carro.setModelo(scanner.nextLine());

        System.out.print("Insira a marca: ");
        carro.setMarca(scanner.nextLine());

        System.out.print("Insira o ano de fabricação: ");
        carro.setAnoFabricacao(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Insira a cor: ");
        carro.setCor(scanner.nextLine());
                
        System.out.print("Insira a capacidade do tanque: ");
        carro.setCapacidadeTanque(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Insira quantos km por litro: ");
        carro.setKmLitro(scanner.nextFloat());
        scanner.nextLine();

        System.out.println("------------------------");
        System.out.println(carro);
    }
}
