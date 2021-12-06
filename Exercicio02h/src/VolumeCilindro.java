import java.util.Scanner;

public class VolumeCilindro {
public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	double a, b, c, d, e;
	System.out.println("Vamos calcular o volume do cilindro: ");
	System.out.println("Insira o valor de PI: ");
	a=teclado.nextDouble();
	System.out.println("Insira o valor de raio a: ");
	b=teclado.nextDouble();
	System.out.println("Insira o valor de raio b: ");
	c=teclado.nextDouble();
	System.out.println("insira o valor da altura: ");
	d=teclado.nextDouble();
	e=a*b*c*d;
	System.out.println("O volume do cilindro é igual à: " + e);

}
}
