package desafio1_GFT;

public class Program {
    public static void main(String[] args) {
        Investimento i1 = new InvestimentoComIr(5000, 1.2);
        Investimento i2 = new InvestimentoSemIr(3000,0.7);

        System.out.println(i1.CalcularLucro(17));
        System.out.println(i2.CalcularLucro(10));
    }
}
