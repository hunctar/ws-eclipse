package exerciciosWhile;
import java.util.Scanner;

public class ValidaSenha {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua senha: ");
		int senha = sc.nextInt();

		while(senha != 2002) {
			System.out.println("Senha inválida");
			System.out.println("Digite sua senha: ");
			senha = sc.nextInt();
		}
		System.out.println("Acesso permitido!");
		sc.close();
	}

}
