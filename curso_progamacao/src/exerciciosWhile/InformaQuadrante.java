package exerciciosWhile;

import java.util.Scanner;

public class InformaQuadrante {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor da coordenada X: ");
		int x = sc.nextInt();
		
		System.out.println("Informe o valor da coordenada Y: ");
		int y = sc.nextInt();
		
		while(x != 0 && y != 0) {
		
		if (x > 0 && y > 0) {
			System.out.println("Quadrante 1");
		}
		else if(x < 0 && y > 0) {
			System.out.println("Quadrante 2");
		}
		else if(x < 0 && y < 0) {
			System.out.println("Quadrante 3");
		}
		else if(x > 0 && y < 0) {
			System.out.println("Quadrante 4");
		}
		else {
			System.out.println("Valor inválido. Digite números ao invés de letras. ");
		}
		
		System.out.println("Informe o valor da coordenada X: ");
		x = sc.nextInt();
		
		System.out.println("Informe o valor da coordenada Y: ");
		y = sc.nextInt();
		
		}
		sc.close();
	}

}
