package distribuicoes.discretas;

import auxiliares.Auxiliares;

public class BinomialNegativaSucesso extends BinomialNegativa  {
    public BinomialNegativaSucesso(int r, double p){
        super(r, p);
    }

    @Override
    public double FP(int x) {
        return  Auxiliares.comb(x - 1, r - 1) * Math.pow(p, r) * Math.pow(1-p, x-r);
    }

}
