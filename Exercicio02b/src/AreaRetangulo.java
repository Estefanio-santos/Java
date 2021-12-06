import java.util.Scanner;

public class AreaRetangulo {
public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	double a, b, c;
	System.out.println("Vamos calcular a área do retângulo:");
	System.out.println("Digite o valor da base:");
	a=teclado.nextDouble();
	System.out.println("Digite o valor da altura: ");
	b=teclado.nextDouble();
	c=a*b;
	System.out.println("O valor da área do retângulo é de: " + c);
}
}
