import distribuicoes.continuas.Exponencial;
import distribuicoes.continuas.Normal;
import distribuicoes.discretas.Binomial;

public class Main {
    public static void main(String[] args) {

        Binomial binomial = new Binomial(7,0.5);
        System.out.println("Probabilidade: " + binomial.FP(6));

        Normal n = new Normal(100, 15);
        double prob = n.FDA(85, 115);
        System.out.println("Probabilidade (deve ser ~0.682): " + prob);

        Exponencial exp = new Exponencial(2);
        System.out.println("a: "+exp.FP(1));
    }
}