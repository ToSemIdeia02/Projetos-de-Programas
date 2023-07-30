import java.util.Scanner;

public class Palindromos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String texto = scanner.nextLine();
        texto = texto.toUpperCase();
        texto = texto.replace(" ", "");
        System.out.print(texto + " ");

        boolean palindromo = true;
        for (int i = 0; i < texto.length() / 2; i++) {
            if (texto.charAt(i) != texto.charAt(texto.length() - 1 - i)) {
                palindromo = false;
                break;
            }
        }
        System.out.println(palindromo ? 1 : 0);
    }
}
