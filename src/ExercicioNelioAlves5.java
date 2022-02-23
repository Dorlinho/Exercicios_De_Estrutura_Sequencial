import java.util.Scanner;

public class ExercicioNelioAlves5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		int n1, ht;
		double vh, salario;
		
		System.out.println("Informe um valor para o funcionário: ");
		n1 = in.nextInt();
		System.out.println("Informe a quantidade de horas trabalhadas pelo funcionário: ");
		ht = in.nextInt();
		System.out.println("Informe o valor pago por hora trabalhada: ");
		vh = in.nextDouble();
		salario = ht * vh;
		System.out.println("Número = " + n1);
		System.out.printf("Salário = R$ %.2f", salario);
		
		in.close();
	}

}
