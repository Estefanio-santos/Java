import java.util.Scanner;

public class AreaTrapezio {
public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	double a, b, c, d;
	System.out.println("Vamos calcular a �rea do trap�zio.");
	System.out.println("insira o valor da base maior:");
	a=teclado.nextDouble();
	System.out.println("insira o valor da base menor:");
	b=teclado.nextDouble();
	System.out.println("Insira o valor da altura: ");
	c=teclado.nextDouble();
	d=(a+b)*c/2;
	System.out.println("A �rea do trap�zio � igual �: " + d);
}
}
