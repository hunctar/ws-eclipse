package curso_programacao;

import java.util.Scanner;

public class Exercicio2_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Digite o primeiro número: ");
		a = sc.nextInt();
		System.out.println("Você digitou: " + a);
		System.out.println("Digite o segundo número: ");		
		b = sc.nextInt();
		System.out.println("Você agora digitou: " + b);
		
		c = a + b;
		System.out.println("A soma dos dois números é: " + c);

	}

}
