import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double preco = scan.nextDouble();

        if (preco >= 200) {
            preco *= 0.95;
        }
        System.out.printf("%.2f\n", preco);
    }
}
