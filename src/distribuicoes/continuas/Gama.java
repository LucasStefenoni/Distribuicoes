package distribuicoes.continuas;

import auxiliares.Auxiliares;
import distribuicoes.Distribuicoes;

public class Gama implements Distribuicoes {
    private double alpha;
    private double beta;

    public Gama(int alpha, int beta) {
        this.alpha = alpha;
        this.beta = beta;
    }

    public double getAlpha() {
        return alpha;
    }

    public void setAlpha(double alpha) {
        this.alpha = alpha;
    }

    public double getBeta() {
        return beta;
    }

    public void setBeta(double beta) {
        this.beta = beta;
    }

    public double FP(double x) {
        return (Math.pow(beta, alpha)/ Auxiliares.fGama(alpha)) * Math.pow(x, alpha-1) * Math.exp(-x*beta);
    }

    public double FDA(double x, double y) {
        if (y < x) {
            double aux;
            aux = x;
            x = y;
            y = aux;
        };
        return Auxiliares.integral(t -> this.FP(t), x, y);
    }

    public double EX() {
        return (double) alpha/beta;
    }

    public double VX() {
        return  (double) alpha/(beta*beta);
    }

    public double DesvPad() {
        return Math.pow(this.VX(), 0.5);
    }
}
