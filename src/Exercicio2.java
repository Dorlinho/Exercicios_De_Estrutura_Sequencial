import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double salario;
		
		System.out.println("Informe seu sal�rio atual: ");
		salario = sc.nextDouble();
		salario = salario * 1.25;
		System.out.printf("Seu sal�rio com 25 porcento de aumento ficar� de: %.2f", salario);
		
		sc.close();

	}

}
