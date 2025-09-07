package curso_programacao;
import java.util.Scanner;

public class Exercicio2_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, diff;
		
		System.out.println("Digite o primeiro número: ");
		A = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		B = sc.nextInt();
		System.out.println("Digite o terceiro número: ");
		C = sc.nextInt();
		System.out.println("Digite o quarto número: ");
		D = sc.nextInt();
		
		diff = (A * B) - (C * D);
		
		System.out.println("A diferença de A * B menos C * D é: " + diff);
	}

}
