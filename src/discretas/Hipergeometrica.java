package discretas;

import auxiliares.Auxiliares;

public class Hipergeometrica implements Distribuicoes{
    private int x;
    private int A;
    private int B;
    private int n;

    public Hipergeometrica(int x, int a, int b, int n) {
        this.x = x;
        this.A = a;
        this.B = b;
        this.n = n;
    }

    public int getX() {
        return x;
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

    public void setX(int x) {
        this.x = x;
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

    public double FP() {
        return (double) ((Auxiliares.comb(A, x) * Auxiliares.comb(B, n - x)) / Auxiliares.comb(A+B, n));
    }
    public double FDA(int y) {
        if(y < x) return -1;
        double result = 0;
        for (int i = x; x <= y; i++){
            result += ((double) Auxiliares.comb(A, i) * Auxiliares.comb(B, n - i)) / Auxiliares.comb(A+B, n);
        }
        return result;
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
