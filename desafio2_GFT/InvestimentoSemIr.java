package desafio2_GFT;

public class InvestimentoSemIr extends Investimento{

    public InvestimentoSemIr(double valorIncicial, double jurosMensais) {
        super(valorIncicial, jurosMensais);
    }

    @Override
    double CalcularLucro(int meses){
        if(this.getValorIncicial() >= 1000){
            return super.CalcularLucro(meses);
        }
        else{
            return 0;
        }
    }
}
