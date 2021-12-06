import java.util.Scanner;

public class VolumeParalelepipedo {
public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	double a, b, c, d;
	System.out.println("Vamos calcular o volume de um paralelepipedo: ");
	System.out.println("Insira o valor da altura: ");
	a=teclado.nextDouble();
	System.out.println("Insira o valor da largura: ");
	b=teclado.nextDouble();
	System.out.println("Insira o valor da profundidade: ");
	c=teclado.nextDouble();
	d=a*b*c;
	System.out.println("O volume de um paralelepipedo corresponde à: " + d);
}
}
