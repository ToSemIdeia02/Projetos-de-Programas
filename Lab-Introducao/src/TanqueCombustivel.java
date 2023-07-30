import java.util.Scanner;

public class TanqueCombustivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();
        double x = sc.nextDouble();
        int opcao = sc.nextInt();

        double volumeEsfera = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
        double volumeCalota = (Math.PI * x * x * (3 * r - x)) / 3;

        if (opcao == 1) {
            System.out.printf("%.4f\n", volumeCalota);
        } else if (opcao == 2) {
            System.out.printf("%.4f\n", volumeEsfera - volumeCalota);
        }
    }
}
