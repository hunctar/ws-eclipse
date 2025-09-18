package exerciciosIfElse;
import java.util.Scanner;

public class OperadorTernario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double preco;
		double desconto;
		double precoComDesconto;
		
		System.out.println("Informe o preço do produto: ");
		preco = sc.nextDouble();
		desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;
		System.out.printf("O valor do desconto é %.2f: ", desconto);
		System.out.println();
		precoComDesconto = preco - desconto;
		System.out.printf("O preço do produto é: %.2f", precoComDesconto);
		sc.close();
	}
}
