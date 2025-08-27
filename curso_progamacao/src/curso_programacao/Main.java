package curso_programacao;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.34567;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		Locale.setDefault(Locale.US);
		System.out.println("Olá Mundo!");
		System.out.println("Tudo bem?");
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		System.out.printf("O valor de X é: %.2f%n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

	}

}