package discretas;

import auxiliares.Auxiliares;

public class Poisson {
    private double lambda;
    static final double e = 2.718281;
    private int x;

    public Poisson(double lambda, int x) {
        this.lambda = lambda;
        this.x = x;
    }

    public double getLambda() {
        return lambda;
    }

    public void setLambda(double lambda) {
        this.lambda = lambda;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double FP() {
        return (Math.pow(e, -lambda) * Math.pow(lambda, x)) / Auxiliares.fact(x);
    }
    public double FDA(int y) {
        if(y < x) return -1;
        double result = 0;
        for (int i = x; i <= y; i++){
            result += (Math.pow(e, -lambda) * Math.pow(lambda, i)) / Auxiliares.fact(i);
        }
        return result;
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
