package distribuicoes.discretas;

import distribuicoes.Distribuicoes;

public abstract class Discreta extends Distribuicoes {

    public double FDA(int x, int y) {
        if(y < x) return -1;
        double result = 0;
        for (int i = x; i <= y; i++)
            this.FP(i);
        return result;
    }

}
