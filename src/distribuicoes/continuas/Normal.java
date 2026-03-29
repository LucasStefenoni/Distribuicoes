package distribuicoes.continuas;

public class Normal extends Continuas {
    private double mi;
    private double delta;

    public Normal(double media, double desvPad) {
        this.mi = media;
        this.delta = desvPad;
    }

    public double FP(double x) {
        double expoente = -0.5 * Math.pow(this.Z(x), 2);
        double denominador = delta * Math.sqrt(2 * Math.PI);
        return Math.exp(expoente) / denominador;
    }

    private double Z(double x) {
        return (x - mi) / delta;
    }

    public double EX() { return mi; }

    public double VX() { return delta * delta; }

}
