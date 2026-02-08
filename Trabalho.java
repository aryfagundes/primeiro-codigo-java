package AulaBack;

import java.util.Scanner;

public class Trabalho {
     public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Olá " + nome + "Digite a nota da sua prova de Geografia ");
        String geografia = scanner.nextLine();
        Double geoDouble = Double.parseDouble(geografia);

        System.out.println("Digite a nota da sua prova de Matematica ");
        String matematica = scanner.nextLine();
        Double matematicaDouble = Double.parseDouble(matematica);

        System.out.println("Digite a nota da sua prova de Biologia ");
        String biologia = scanner.nextLine();

        Double biologiaDouble = Double.parseDouble(biologia);

        double resultado = (biologiaDouble + matematicaDouble + geoDouble) / 3.00;

        if (resultado >= 75.00) {
                System.err.println("Olá " + nome + " Sua média foi de " + resultado + ". Você está aprovado");
        }
        else {
                System.out.println("Olá " + nome + " Sua média foi de " + resultado + ". Você está reprovado");
        }

        }
}
