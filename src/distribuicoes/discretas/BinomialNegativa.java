package distribuicoes.discretas;

import distribuicoes.Distribuicoes;

public class BinomialNegativa implements Distribuicoes {
    protected int x;
    protected int r;
    protected double p;

    public BinomialNegativa(int r, double p) {
        this.r = r;
        this.p = p;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public double FP(double x) {
        return 0;
    }

    public double FDA(double x, double y) {
        return 0;
    }

    public double EX() {
        return (r*(1-p)) / p;
    }

    public double VX() {
        return (r*(1-p)) / (p*p);
    }

    public double DesvPad() {
        return Math.pow(this.VX(), 0.5);
    }
}
