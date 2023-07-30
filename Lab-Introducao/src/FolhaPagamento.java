import java.util.Scanner;

public class FolhaPagamento {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double valorHora = scan.nextDouble();
        int horasTrabalhadas = scan.nextInt();
        double salarioBruto = valorHora * horasTrabalhadas;
        double impostoRenda = salarioBruto * 0.11;
        double inss = salarioBruto * 0.08;
        double totalDescontos = impostoRenda + inss;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.printf("Salario bruto: R$%.2f\n", salarioBruto);
        System.out.printf("IR: R$%.2f\n", impostoRenda);
        System.out.printf("INSS: R$%.2f\n", inss);
        System.out.printf("Total de descontos: R$%.2f\n", totalDescontos);
        System.out.printf("Salario liquido: R$%.2f\n", salarioLiquido);
    }
}
