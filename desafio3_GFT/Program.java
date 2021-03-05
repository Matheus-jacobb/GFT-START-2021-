package desafio3_GFT;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Multiplicando: ");
        int n1 = sc.nextInt();
        if (n1 <=0 || n1 > 5000) {
            System.out.println("O multiplicando não pode ser negativo e não pode ser maior que 5000.");
        }
        else{
            System.out.print("Inicio do intervalo: ");
            int inicio = sc.nextInt();
            System.out.print("Fim do intervalo: ");
            int fim = sc.nextInt();
            if ( inicio >= fim ){
                System.out.println("O inicio do interval deve ser menor que seu fim");
            }
            else if (inicio < 0 || fim < 0 || inicio > 5000 || fim > 5000){
                System.out.println("Inicio e fim devem ser positivos e menores que 5000");
            }
            else if ( (fim - inicio) > 10){
                System.out.println("Intervalo entre inicio e fim deve ser menor que 10");
            }
            else{
            for (int i = inicio; i< fim ; i++){
                System.out.println(i + " x " + n1 + " = " + (i * n1));
            }
            }
            }
            sc.close();
        }
}
