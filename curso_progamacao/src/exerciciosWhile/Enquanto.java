package exerciciosWhile;

import java.util.Scanner;

public class Enquanto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero qualquer, digite 0 (zero) para fechar:");
		int x = sc.nextInt();
		
		int soma = 0;
		
		while (x != 0) {
			soma = soma + x;
			System.out.println("Digite um numero qualquer, digite 0 (zero) para fechar:");
			x = sc.nextInt();
		}
		
		System.out.println(soma);
		sc.close();
	}
}