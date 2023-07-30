import java.util.Scanner;

public class ArteAscii {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int size = scan.nextInt();

		for(int i = size - 1; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*" + "");
			}
			System.out.println();
		}
		for(int i = 0; i < size; i++) {
			
			for(int j=0 ;j<=i ;j++) {
			System.out.print("*" + "");
			}

			System.out.println();
		}
	}
}
