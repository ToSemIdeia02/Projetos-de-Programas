import java.util.Scanner;

public class PinturaMuro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double precoPintor = scan.nextDouble();
        double areaMuro = 12 * 3;
        double custoPintura = areaMuro * precoPintor;
        double custoTotal = custoPintura + 100;

        System.out.printf("%.1f\n", custoTotal);
    }
}
