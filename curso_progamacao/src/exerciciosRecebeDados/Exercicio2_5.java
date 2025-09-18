package exerciciosRecebeDados;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio2_5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int peca1, peca2, qtd1, qtd2;
		double valor1, valor2, total;
		
		System.out.println("Digite o código da primeira peça: ");
		peca1 = sc.nextInt();
		System.out.println("Digite a quantidade adquiridas dessa primeira peça: ");
		qtd1 = sc.nextInt();
		System.out.println("Digite o valor unitário da primeira peça: ");
		valor1 = sc.nextDouble();
		System.out.println("Digite o código da segunda peça: ");
		peca2 = sc.nextInt();
		System.out.println("Digite a quantidade adquiridas dessa segunda peça: ");
		qtd2 = sc.nextInt();
		System.out.println("Digite o valor unitário da segunda peça: ");
		valor2 = sc.nextDouble();
		
		total = (qtd1 * valor1) + (qtd2 * valor2);
		
		System.out.println("Código da primeira peça: " + peca1 + " Código da segunda peça: " + peca2);
		System.out.printf("O valor total a ser pago é R$ %.2f", total);

		sc.close();
	}

}
