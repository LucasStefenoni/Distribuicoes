package distribuicoes.discretas;
import auxiliares.Auxiliares;

public class Binomial extends Discreta {
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

    public double FP(int x) {
        return Auxiliares.comb(n, x) * Math.pow(p, x) * Math.pow((1-p), (n-x));
    }

    public double EX() {
        return n*p;
    }

    public double VX() {
        return n*p*(1-p);
    }

}
