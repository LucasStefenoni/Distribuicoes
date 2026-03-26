package discretas;
import auxiliares.Auxiliares;

public class Binomial implements Distribuicoes {
    private int n;
    private int x;
    private double p;

    public Binomial(int n, int x, double p) {
        this.n = n;
        this.x = x;
        this.p = p;
    }
    public void setN(int n) {
        this.n = n;
    }

    public int getN() {
        return this.n;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return this.x;
    }

    public void setP(int p) {
        this.p = p;
    }

    public double getP() {
        return this.p;
    }

    public double FP() {
        return Auxiliares.comb(n, x) * Math.pow(p, x) * Math.pow((1-p), (n-x));
    }

    public double FDA(int y) {
        if(y < x) return -1;
        double result = 0;
        for (int i = x; i <= y; i ++) {
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
