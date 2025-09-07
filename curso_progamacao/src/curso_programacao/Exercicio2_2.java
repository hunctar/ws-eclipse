package curso_programacao;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio2_2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio;
		double pi = 3.14159;
		double area;
		
		System.out.println("Digite o valor do raio do círculo");
		raio = sc.nextDouble();
		
		area = pi*(Math.pow(raio, 2));

		System.out.printf("A área do cículo é: %.4f", area);
	}

}
