package distribuicoes.discretas;

import auxiliares.Auxiliares;

public class Poisson extends Discreta {
    private double lambda;

    public Poisson(double lambda) {
        this.lambda = lambda;
    }

    public double getLambda() {
        return lambda;
    }

    public void setLambda(double lambda) {
        this.lambda = lambda;
    }

    public double FP(int x) {
        return (Math.exp(-lambda) * Math.pow(lambda, x)) / Auxiliares.fact( x);
    }

    public double EX() {
        return lambda;
    }

    public double VX() {
        return lambda;
    }
}
