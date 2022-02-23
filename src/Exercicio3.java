import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double salario, hora;
		
		System.out.println("Informe qual o valor em reais por hora trabalhada: ");
		salario = sc.nextDouble();
		System.out.println("Informe a quantidade de horas trabalhadas no mês: ");
		hora = sc.nextDouble();
		salario = salario * hora;
		System.out.println("Seu salário ganho no mês foi de: " + salario);
		
		sc.close();
	}

}
