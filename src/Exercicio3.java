import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double salario, hora;
		
		System.out.println("Informe qual o valor em reais por hora trabalhada: ");
		salario = sc.nextDouble();
		System.out.println("Informe a quantidade de horas trabalhadas no m�s: ");
		hora = sc.nextDouble();
		salario = salario * hora;
		System.out.println("Seu sal�rio ganho no m�s foi de: " + salario);
		
		sc.close();
	}

}
