package distribuicoes.continuas;

import auxiliares.Auxiliares;

public class Gama extends Continuas {
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

    public double EX() {
        return alpha/beta;
    }

    public double VX() {
        return alpha/(beta*beta);
    }

}
