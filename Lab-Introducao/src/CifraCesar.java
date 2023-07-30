import java.util.Scanner;

public class CifraCesar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int deslocamento = scan.nextInt();

        String texto = scan.nextLine();
        StringBuilder encrypted = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            char letter = texto.charAt(i);
            if (Character.isLetter(letter)) {
                letter = Character.toUpperCase(letter);
                letter -= 'A';
                letter += deslocamento;
                letter %= 26;
                letter += 'A';
            }
            encrypted.append(letter);
        }

        encrypted.deleteCharAt(0);

        System.out.println(encrypted.toString());
    }
}
