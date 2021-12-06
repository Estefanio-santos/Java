import java.util.Scanner;

public class AreaLosango {
public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	Double a, b, c;
	System.out.println("Vamos calcular a área do losango:");
	System.out.println("Insira o valor da diagonal 1:");
	a=teclado.nextDouble();
	System.out.println("Agora insira o valor da diagonal 2: ");
	b=teclado.nextDouble();
	c=a*b;
	System.out.println("O valor da área do losango é igual à: " + c);
}
}
