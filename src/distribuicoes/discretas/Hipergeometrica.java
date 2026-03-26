package distribuicoes.discretas;

import auxiliares.Auxiliares;
import distribuicoes.Distribuicoes;

public class Hipergeometrica implements Distribuicoes {
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

    public double FP(double x) {
        return (double) ((Auxiliares.comb(A, (int) x) * Auxiliares.comb(B, n - (int) x)) / Auxiliares.comb(A+B, n));
    }
    public double FDA(double x, double y) {
        if(y < x) return -1;
        double result = 0;
        for (int i = (int) x; i <= y; i++){
            result += ((double) Auxiliares.comb(A, i) * Auxiliares.comb(B, n - i));
        }
        return result / Auxiliares.comb(A+B, n);
    }
    public double EX() {
        return n * ((double) A/(A+B));
    }
    public double VX() {
        return n * ((double) A/(A+B)) * ((double) (A+B-n)/(A+B-1)) * (1.0 - (double) A/(A+B));
    }
    public double DesvPad() {
        return Math.pow(this.VX(), 0.5);
    }
}
