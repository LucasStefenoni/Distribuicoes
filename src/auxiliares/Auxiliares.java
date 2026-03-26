package auxiliares;

public class Auxiliares {

    public static long fact(int n) {
        if (n <= 1) return 1;
        return n * fact(n - 1);
    }

    public static long comb(int n, int m) {
        return (fact(n))/(fact(m)*fact(n-m));
    }
}
