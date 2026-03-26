package auxiliares;

import java.util.function.DoubleFunction;

public abstract class Auxiliares {

    public static long fact(int n) {
        if (n <= 1) return 1;
        return n * fact(n - 1);
    }

    public static long comb(int n, int m) {
        return (fact(n))/(fact(m)*fact(n-m));
    }

    public static double integral(DoubleFunction<Double> f, double a, double b) {
        int n = 1000;
        double h = (b - a) / n;
        double soma = f.apply(a) + f.apply(b);

        for (int i = 1; i < n; i++) {
            double x = a + i * h;
            if (i % 2 == 0) {
                soma += 2 * f.apply(x);
            } else {
                soma += 4 * f.apply(x);
            }
        }
        return (h / 3) * soma;
    }

    public static double fGama(double alpha) {
        int limit = 70;
        return integral(x -> Math.pow(x, alpha - 1) * Math.exp(-x), 0, limit);
    }
}
