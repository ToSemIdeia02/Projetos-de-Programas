import java.util.ArrayList;
import java.util.Scanner;

public class TimeFutebol {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> goals = new ArrayList<>();

        while (true) {
            int n = scan.nextInt();
            if (n == -1) {
                break;
            }
            goals.add(n);
        }
        ArrayList<Integer> goalsConceded = new ArrayList<>();
        while (true) {
            int n = scan.nextInt();
            if (n == -1) {
                break;
            }
            goalsConceded.add(n);
        }
        
        int vitorias = 0;
        int empates = 0;
        int derrotas = 0;
        
        for (int i = 0; i < goals.size(); i++) {
            if (goals.get(i) > goalsConceded.get(i)) {
                vitorias++;
            } else if (goals.get(i) == goalsConceded.get(i)) {
                empates++;
            } else {
                derrotas++;
            }
        }
        System.out.println(vitorias + " " + empates + " " + derrotas);
    }
}
