import java.util.Scanner;

public class SomaColecoes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int soma = 0;

        while (true) {
            int valor = scan.nextInt();
            if (valor == -1) {
                System.out.println(soma);
                soma = 0;
            } else {
                soma += valor;
            }
            if (soma == 0 && valor == -1) {
                break;
            }
        }
    }
}
