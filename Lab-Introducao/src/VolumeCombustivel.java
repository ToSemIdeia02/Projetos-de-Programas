import java.util.Scanner;

public class VolumeCombustivel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double h = scan.nextDouble();
        double c = scan.nextDouble();
        double r = scan.nextDouble();
        double volume = 0;

        if (h < 0 || c < 0 || r < 0 || c > h) {
            System.out.printf("%.3f\n", -1.000);
            return;
        }
        if (c <= r) {
            volume = (Math.PI * Math.pow(c, 3)) / 3 - (Math.PI * Math.pow(c, 2) * (3 * r - c)) / 3;
        } else if (c <= h - r) {
            volume = (4 * Math.PI * Math.pow(r, 3)) / 3 - (Math.PI * Math.pow(r, 2) * h) / 3 + Math.PI * Math.pow(r, 2) * c;
        } else {
            volume = (4 * Math.PI * Math.pow(r, 3)) / 3 - (Math.PI * Math.pow(h - c, 3)) / 3 + (Math.PI * Math.pow(h - c, 2) * (3 * r - h + c)) / 3;
        }
        System.out.printf("%.3f\n", volume);
    }
}
