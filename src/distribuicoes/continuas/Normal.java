package distribuicoes.continuas;

import auxiliares.Auxiliares;
import distribuicoes.Distribuicoes;

public class Normal implements Distribuicoes {
    private double mi;
    private double delta;

    public Normal(double media, double desvPad) {
        this.mi = media;
        this.delta = desvPad;
    }

    public double FP(double x) {
        double expoente = -0.5 * Math.pow((x - mi) / delta, 2);
        double denominador = delta * Math.sqrt(2 * Math.PI);
        return Math.exp(expoente) / denominador;
    }

    private double Z(double x) {
        return (x - mi) / delta;
    }

    public double FDA(double x, double y) {
        return Auxiliares.integral(t -> this.FP(t), x, y);
    }

    public double EX() { return mi; }

    public double VX() { return delta * delta; }

    public double DesvPad() {
        return this.delta;
    }
}
