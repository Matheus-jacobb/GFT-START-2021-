package desafio4_GFT;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int sum = 0;

        while (sum <= 156){
            System.out.print("Digite um numero: ");
            int num = sc.nextInt();
                if (num <0){
                    System.out.println("Numeros negativos nao sao permitidos.");
                }
                else{
                    sum += num;
                }
        }
        System.out.println("O Somátorio foi "+sum);
        sc.close();
    }
}
