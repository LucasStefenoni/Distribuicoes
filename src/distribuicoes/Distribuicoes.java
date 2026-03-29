package distribuicoes;

public abstract class Distribuicoes implements DistribuicoesInterface {

    public abstract double FP(int x);

    public abstract double FDA(int x, int y);

    public abstract double EX();

    public abstract double VX();

    public double DesvPad() {
        return Math.sqrt(this.VX());
    }
}
