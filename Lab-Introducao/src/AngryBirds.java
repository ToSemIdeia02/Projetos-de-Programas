import java.util.Scanner;

public class AngryBirds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double v0 = scan.nextDouble();
        double anguloGraus = scan.nextDouble();
        double distancia = scan.nextDouble();
        double anguloRadianos = Math.toRadians(anguloGraus);
        double g = 9.8;
        double alcanceMaximo = (v0 * v0 * Math.sin(2 * anguloRadianos)) / g;

        if (Math.abs(alcanceMaximo - distancia) <= 0.01) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
