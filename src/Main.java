import discretas.Binomial;

public class Main {
    public static void main(String[] args) {

        Binomial binomial = new Binomial(7,6,0.5);
        System.out.println("Probabilidade: " + binomial.FP());
    }
}