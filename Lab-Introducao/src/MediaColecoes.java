import java.util.Scanner;

public class MediaColecoes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double sum = 0;
        int cont = 0;
        int flag = -1;

        while (true) {
            double num = scan.nextDouble();

            if (num == flag) {
                if (cont == 0) {
                    break;
                }
                System.out.printf("%.2f\n", sum / cont);
                sum = 0;
                cont = 0;
            } else {
                sum += num;
                cont++;
            }
        }
        scan.close();
    }
}
