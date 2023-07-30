import java.util.Scanner;

public class ValorExpoente {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int i = 1;
        int sum = 0;

        while (sum < num) {
            sum += i * i;
            i++;
        }
        i = i - 1;
        System.out.println(i);
    }
}
