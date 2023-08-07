package cap_2_estrutura_sequencia.aula_24_saida_dados;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        int y = 32;
        double x = 10.35784;

        System.out.print("Bom dia! ");
        System.out.println("Bom dia!");

        System.out.println(y);

        System.out.println(x);
        System.out.printf("%.2f%n", x);

        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);


        System.out.println("---------- Segunda parte ----------");

        System.out.println("Resultado = " + x + " Metros");
        System.out.printf("Resultado = %.2f Metros%n", x);

        System.out.println();
        System.out.println("---------- Terciera parte ----------");

        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;

        System.out.printf("%s tem %d anos e ganha %.2f reais %n", nome, idade, renda);


    }
}