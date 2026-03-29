package distribuicoes.discretas;

import auxiliares.Auxiliares;

public class Hipergeometrica extends Discreta {
    private int A;
    private int B;
    private int n;

    public Hipergeometrica(int a, int b, int n) {
        this.A = a;
        this.B = b;
        this.n = n;
    }

    public int getA() {
        return A;
    }

    public int getB() {
        return B;
    }

    public int getN() {
        return n;
    }

    public void setA(int a) {
        A = a;
    }

    public void setB(int b) {
        B = b;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double FP(int x) {
        return (double) ((Auxiliares.comb(A, x) * Auxiliares.comb(B, n - x)) / Auxiliares.comb(A+B, n));
    }

    public double EX() {
        return n * ((double) A/(A+B));
    }

    public double VX() {
        return n * ((double) A/(A+B)) * ((double) (A+B-n)/(A+B-1)) * (1.0 - (double) A/(A+B));
    }

}
