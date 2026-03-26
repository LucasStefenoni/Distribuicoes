package discretas;

import auxiliares.Auxiliares;

public class BinomialNegativaFracasso extends BinomialNegativa{
    public BinomialNegativaFracasso(int x, int r, double p, int n){
        super(x, r, p);
    }

    @Override
    public double FP() {
        return  Auxiliares.comb(x + r - 1, r - 1) * Math.pow(p, r) * Math.pow(1-p, x);
    }

    @Override
    public double FDA(int y) {
        if (y < x) return -1;
        double result = 0;
        for (int i = x; i <= y; i++) {
            result += Auxiliares.comb(i + r - 1, r - 1) * Math.pow(p, r) * Math.pow(1-p, i);
        }
        return result;
    }
}
