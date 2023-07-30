import java.util.Scanner;

public class MediaColecao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int soma = 0;
        int contador = 0;

        while (true) {
            int valor = scan.nextInt();
            if (valor == -1) {
                break;
            }
            soma += valor;
            contador++;
        }
        double media = (double) soma / contador;
        System.out.printf("%.2f\n", media);
    }
}
