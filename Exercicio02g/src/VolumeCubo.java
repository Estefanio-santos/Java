import java.util.Scanner;

public class VolumeCubo {
public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	double a, b, c, d;
	System.out.println("Vamos calcular o volume do cubo: ");
	System.out.println("Insira o valor do lado a: ");
	a=teclado.nextDouble();
	System.out.println("Insira o valor do lado b: ");
	b=teclado.nextDouble();
	System.out.println("Insira o valor do lado c: ");
	c=teclado.nextDouble();
	d=a*b*c;
	System.out.println("O volume do cubo é igual à: " + d);
}
}
