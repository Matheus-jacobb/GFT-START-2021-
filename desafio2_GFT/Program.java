package desafio2_GFT;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor inicial: ");
        Double valor = sc.nextDouble();

        Investimento i1 = new InvestimentoSemIr(valor,0.3);
        Investimento i2 = new InvestimentoComIr(valor, 0.35);

        if ( valor < 1000)
         System.out.println("O valor inicial nao pode ser menor que R$1000");

        for ( int i = 1; i<=36; i++){
            System.out.println("Mes: " + i + " | Investimento sem IR :" +
            String.format("%.2f", i1.CalcularLucro(i)) + 
            " | Investimento com IR: " + 
            String.format("%.2f", i2.CalcularLucro(i)));
        }
        sc.close();
    }
}
