package distribuicoes.continuas;

import distribuicoes.Distribuicoes;

public class Exponencial implements Distribuicoes {
    public Exponencial(double lambda) {
        this.lambda = lambda;
    }

    private double lambda;

    public double getLambda() {
        return lambda;
    }

    public void setLambda(double lambda) {
        this.lambda = lambda;
    }

    public double FP(double x) {
        return lambda * Math.exp(-lambda*x);
    }

    public double FDA(double x, double y) {
        if(x < 0) return -1;
        return 1 - Math.exp(-lambda*x);
    }

    public double EX() {
        return 1/lambda;
    }

    public double VX() {
        return 1/(lambda*lambda);
    }

    public double DesvPad() {
        return Math.sqrt(this.VX());
    }
}
