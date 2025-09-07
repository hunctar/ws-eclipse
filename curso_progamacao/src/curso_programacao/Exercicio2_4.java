package curso_programacao;
import java.util.Scanner;

public class Exercicio2_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num_func;
		double horas, valor_hora, salario;
		
		System.out.println("Digite o número do funcionário: ");
		num_func = sc.nextInt();
		System.out.println("Digite quantas horas ele trabalhou: ");
		horas = sc.nextDouble();
		System.out.println("Informe o valor que ele recebe por hora: ");
		valor_hora = sc.nextDouble();
		
		salario = horas * valor_hora;
		System.out.println("Número do funcionário: " + num_func);
		System.out.printf("O funcionário recebeu R$ %.2f de salario esse mês.", salario);

	}

}
