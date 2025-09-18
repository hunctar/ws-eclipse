package exerciciosIfElse;
import java.util.Scanner;

public class exercicioSwitchCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o dia da semana, conforme abaixo:");
		System.out.println("1 - Domingo");
		System.out.println("2 - Segunda");
		System.out.println("3 - Terça");
		System.out.println("4 - Quarta");
		System.out.println("5 - Quinta");
		System.out.println("6 - Sexta");
		System.out.println("7 - Sábado");
		System.out.println();
		int x = sc.nextInt();
		String dia;
		
		switch (x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terça";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sábado";
			break;
		default:
			dia = "valor inválido!";
			break;
		}
		System.out.println("Dia da semana: " + dia);
		sc.close();
	}
}