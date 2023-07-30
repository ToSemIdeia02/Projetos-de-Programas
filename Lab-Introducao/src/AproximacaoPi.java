import java.util.Scanner;

public class AproximacaoPi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        double pi = 3;

        for (int i = 0; i < num; i++) {
            if (i > 0) {
                pi += 4 * (Math.pow(-1, i) / (2 * i + 1));
            }
            System.out.printf("%.6f\n", pi);
        }
        scan.close();
    }
}
