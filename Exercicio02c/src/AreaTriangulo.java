import java.util.Scanner;

public class AreaTriangulo {
public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	Double a, b, c;
	System.out.println("Vamos calcular a �rea do tri�ngulo");
	System.out.println("Digite o valor da base do tri�ngulo: ");
	a=teclado.nextDouble();
	System.out.println("Digite o valor da altura do tri�ngulo: ");
	b=teclado.nextDouble();
	c=(a*b)/2;
	System.out.println("A �rea do tri�ngulo equivale �: " + c);
}
}
