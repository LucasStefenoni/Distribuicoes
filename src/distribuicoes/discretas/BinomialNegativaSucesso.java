package distribuicoes.discretas;

import auxiliares.Auxiliares;
import distribuicoes.Distribuicoes;

public class BinomialNegativaSucesso extends BinomialNegativa implements Distribuicoes {
    public BinomialNegativaSucesso(int r, double p, int n){
        super(r, p);
    }

    @Override
    public double FP(double x) {
        return  Auxiliares.comb((int) x - 1, r - 1) * Math.pow(p, r) * Math.pow(1-p, x-r);
    }

    @Override
    public double FDA(double x, double y) {
        if (y < x) return -1;
        double result = 0;
        for (int i = (int) x; i <= y; i++) {
            result += Auxiliares.comb(i - 1, r - 1) * Math.pow(1-p, i-r);
        }
        return result * Math.pow(p, r);
    }
}
