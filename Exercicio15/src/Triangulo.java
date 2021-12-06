import java.util.Scanner;

public class Triangulo {
public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	double la, lb, lc;
	System.out.println("Insira a medida a");
	la=teclado.nextDouble();
	System.out.println("Insira a medida b:");
	lb=teclado.nextDouble();
	System.out.println("Insira a medida c:");
	lc=teclado.nextDouble();
	if(la+lb>=lc && la+lc>=lb && lb+lc>=la) {
		System.out.println("As medidas informadas formam um triângulo!");
	}
	else {
		System.out.println("As medidas informadas  não formam um triângulo!");
	}
	if(la==lb && lb==lc) {
		System.out.println("O triãngulo é um equilátero.");
	}
	else if(la==lb || lb==lc || la==lc) {
		System.out.println("Triângulo isósceles.");
	}
	else {
		System.out.println("Triângulo escaleno.");
	}
}
}
