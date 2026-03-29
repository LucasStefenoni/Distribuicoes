package distribuicoes.discretas;

import auxiliares.Auxiliares;

public class BinomialNegativaFracasso extends BinomialNegativa  {
    public BinomialNegativaFracasso(int r, double p){
        super(r, p);
    }

    @Override
    public double FP(int x) {
        return  Auxiliares.comb(x + r - 1, r - 1) * Math.pow(p, r) * Math.pow(1-p, x);
    }

}
