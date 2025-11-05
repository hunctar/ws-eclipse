package exerciciosFor;

import java.util.Scanner;

public class ExercFor_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de repetições desejadas:");
		int N = sc.nextInt();
		int soma = 0;
		
		for(int i=0; i<N; i++) {
			System.out.println("Informe o " + (i+1) + "º número para a soma: ");
			int x = sc.nextInt();
			soma = soma + x;
		}
		System.out.println("Soma total: " + soma);
		
		sc.close();
	}

}