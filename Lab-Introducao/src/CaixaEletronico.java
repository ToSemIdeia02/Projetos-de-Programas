import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int amount50;
		int amount10;
		int amount2;
		
		int val = scan.nextInt();
		
		if (val % 2 == 0 && val > 0) {
			
			amount50 = val / 50;
			val = val - (amount50 * 50);
			
			amount10 = (val % 50)/10;
			
			
			amount2 = (val % 10)/2;
			
			
			System.out.print(amount50 + " notas de R$50, " + amount10 + " notas de R$10 e " + amount2 + " notas de R$2");

					
		} else {
			System.out.print("Valor Invalido");
		}

	}

}
