import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double celsius = scan.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.printf("%.1f\n", fahrenheit);
    }
}
