package distribuicoes.continuas;

public class Exponencial extends Continuas {

    private double lambda;

    public Exponencial(double lambda) {
        this.lambda = lambda;
    }

    public double getLambda() {
        return lambda;
    }

    public void setLambda(double lambda) {
        this.lambda = lambda;
    }

    public double FP(double x) {
        return lambda * Math.exp(-lambda*x);
    }

    @Override
    public double FDA(int x, int y) {
        if(x < 0) return -1;
        return 1 - Math.exp(-lambda*x);
    }

    public double EX() {
        return 1/lambda;
    }

    public double VX() {
        return 1/(lambda*lambda);
    }
}
