package distribuicoes.discretas;

public abstract class BinomialNegativa extends Discreta {
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

    public double EX() {
        return (r*(1-p)) / p;
    }

    public double VX() {
        return (r*(1-p)) / (p*p);
    }

}
