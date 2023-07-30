import java.util.Scanner;
public class SomaColecao {
	public static void main(String[] args) {

		int size, sum = 0;
        Scanner scan = new Scanner(System.in);

        int vect[] = new int[100];
        int i = 0;
        
        vect[i] = 0;
        
        while(vect[i] != -1) {
        	vect[i] = scan.nextInt();
            sum = sum + vect[i];
        }
        sum = sum + 1;
        
        System.out.println(sum);

        }

    }

