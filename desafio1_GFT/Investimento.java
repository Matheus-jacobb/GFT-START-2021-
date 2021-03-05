package desafio1_GFT;

public class Investimento {
    private double valorInicial;
    private double jurosMensais;
    public double getValorIncicial() {
        return valorInicial;
    }
    public void setValorIncicial(double valorIncicial) {
        this.valorInicial = valorIncicial;
    }
    public double getJurosMensais() {
        return jurosMensais;
    }
    public void setJurosMensais(double jurosMensais) {
        this.jurosMensais = jurosMensais;
    }
    public Investimento(double valorIncicial, double jurosMensais) {
        this.valorInicial = valorIncicial;
        this.jurosMensais = jurosMensais;
    }
    double CalcularLucro(int meses){
        System.out.println("JUROOOOS" + jurosMensais);
        return ((valorInicial * Math.pow((1 + this.jurosMensais/100),meses))-valorInicial);
    }



        
}
