package distribuicoes.continuas;

import auxiliares.Auxiliares;
import distribuicoes.Distribuicoes;

public abstract class Continuas extends Distribuicoes {

    public abstract double FP(double x);

    public double FDA(double x, double y) {
        if(y < x) return -Auxiliares.integral(this::FP, y, x);
        return Auxiliares.integral(this::FP, x, y);
    }

    public double FP(int x) {
        return this.FP((double) x);
    }
    public double FDA(int x, int y) {
        return this.FDA((double) x, (double) y);
    }
}
