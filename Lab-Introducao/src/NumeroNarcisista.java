import java.util.Scanner;

public class NumeroNarcisista {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int temp = num;
        int numDigits = 0;

        while (temp > 0) {
            temp /= 10;
            numDigits++;
        }
        temp = num;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numDigits);
            temp = temp / 10;
        }

        if (sum == num) {
            System.out.println("SIM");
        } else {
            System.out.println("NAO");
        }
    }
}
