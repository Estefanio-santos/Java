import java.util.Scanner;

public class AreaTriangulo {
public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	Double a, b, c;
	System.out.println("Vamos calcular a área do triângulo");
	System.out.println("Digite o valor da base do triângulo: ");
	a=teclado.nextDouble();
	System.out.println("Digite o valor da altura do triângulo: ");
	b=teclado.nextDouble();
	c=(a*b)/2;
	System.out.println("A área do triângulo equivale à: " + c);
}
}
