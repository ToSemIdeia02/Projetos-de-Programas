import java.util.Scanner;

public class AproximacaoSeno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double graus = scan.nextDouble();

        int k = scan.nextInt();
        double radianos = Math.toRadians(graus);
        double seno = 0;

        for (int i = 0; i < k; i++) {
            seno += (Math.pow(-1, i) / fatorial(2 * i + 1)) * Math.pow(radianos, 2 * i + 1);
            System.out.printf("%.10f\n", seno);
        }
        scan.close();
    }

    public static long fatorial(int n) {
        long fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
