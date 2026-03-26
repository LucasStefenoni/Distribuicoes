package distribuicoes.discretas;

import auxiliares.Auxiliares;
import distribuicoes.Distribuicoes;

public class Poisson implements Distribuicoes {
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


    public double FP(double x) {
        return (Math.exp(-lambda) * Math.pow(lambda, x)) / Auxiliares.fact((int) x);
    }
    public double FDA(double x, double y) {
        if(y < x) return -1;
        double result = 0;
        for (int i = (int) x; i <= y; i++){
            result += Math.pow(lambda, i) / Auxiliares.fact(i);
        }
        return Math.exp(-lambda) * result;
    }
    public double EX() {
        return lambda;
    }
    public double VX() {
        return lambda;

    }
    public double DesvPad() {
        return Math.pow(lambda, 0.5);
    }
}
