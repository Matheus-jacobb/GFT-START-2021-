package desafio2_GFT;

public class InvestimentoComIr extends Investimento{

    public InvestimentoComIr(double valorIncicial, double jurosMensais) {
        super(valorIncicial, jurosMensais);
        //TODO Auto-generated constructor stub
    }

    @Override
    double CalcularLucro(int meses){
        double calc = super.CalcularLucro(meses);
        if (meses < 6){
            return (calc - (calc*0.225));
            }
        else if (meses >= 6 && meses < 12){
            return (calc - (calc*0.20));
        }
        else if (meses >=12 && meses < 24){
            return (calc - (calc*0.175));
        }
        else {
            return (calc - (calc*0.15));
        }
    }
    
}
