import java.util.Scanner;

public class DataExtenso {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String data = scan.nextLine();
        int day = Integer.parseInt(data.substring(0, 2));
        int month = Integer.parseInt(data.substring(2, 4));
        int year = Integer.parseInt(data.substring(4, 8));

        String[] months = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};

        System.out.println(day + " de " + months[month - 1] + " de " + year);
    }
}

