package distribuicoes.discretas;
import auxiliares.Auxiliares;
import distribuicoes.Distribuicoes;

public class Binomial implements Distribuicoes {
    private int n;
    private double p;

    public Binomial(int n, double p) {
        this.n = n;
        this.p = p;
    }
    public void setN(int n) {
        this.n = n;
    }

    public int getN() {
        return this.n;
    }

    public void setP(int p) {
        this.p = p;
    }

    public double getP() {
        return this.p;
    }

    public double FP(double x) {
        return Auxiliares.comb(n, (int) x) * Math.pow(p, x) * Math.pow((1-p), (n-x));
    }

    public double FDA(double x, double y) {
        if(y < x) return -1;
        double result = 0;
        for (int i = (int) x; i <= y; i ++) {
            result += Auxiliares.comb(n, i) * Math.pow(p, i) * Math.pow((1-p), (n-i));
        }
        return result;
    }

    public double EX() {
        return n*p;
    }

    public double VX() {
        return n*p*(1-p);
    }

    public double DesvPad() {
        return Math.pow(this.VX(), 0.5);
    }
}
