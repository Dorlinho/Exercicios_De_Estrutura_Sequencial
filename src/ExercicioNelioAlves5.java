import java.util.Scanner;

public class ExercicioNelioAlves5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		int n1, ht;
		double vh, salario;
		
		System.out.println("Informe um valor para o funcion�rio: ");
		n1 = in.nextInt();
		System.out.println("Informe a quantidade de horas trabalhadas pelo funcion�rio: ");
		ht = in.nextInt();
		System.out.println("Informe o valor pago por hora trabalhada: ");
		vh = in.nextDouble();
		salario = ht * vh;
		System.out.println("N�mero = " + n1);
		System.out.printf("Sal�rio = R$ %.2f", salario);
		
		in.close();
	}

}
