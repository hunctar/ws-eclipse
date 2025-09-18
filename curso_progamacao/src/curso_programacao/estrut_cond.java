package curso_programacao;

import java.util.Scanner;

public class estrut_cond {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int hora;
		
		System.out.println("Digite o horário:");
		hora = sc.nextInt();
		
		if(hora > 0 && hora <= 12 ) {
			System.out.println("Bom dia!");
		}
		else if(hora > 12 && hora <= 18){
			System.out.println("Boa tarde!");
		}
		else if(hora > 18 && hora < 24){
			System.out.println("Boa noite!");
		}
		else {
			System.out.println("Hora inválida!");
		}
		sc.close();
	}
}