package discretas;

import auxiliares.Auxiliares;

public class BinomialNegativaSucesso extends BinomialNegativa {
    public BinomialNegativaSucesso(int x, int r, double p, int n){
        super(x, r, p);
    }

    @Override
    public double FP() {
        return  Auxiliares.comb(x - 1, r - 1) * Math.pow(p, r) * Math.pow(1-p, x-r);
    }

    @Override
    public double FDA(int y) {
        if (y < x) return -1;
        double result = 0;
        for (int i = x; i <= y; i++) {
            result += Auxiliares.comb(i - 1, r - 1) * Math.pow(p, r) * Math.pow(1-p, i-r);
        }
        return result;
    }
}
