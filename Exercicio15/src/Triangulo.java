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
		System.out.println("As medidas informadas formam um tri�ngulo!");
	}
	else {
		System.out.println("As medidas informadas  n�o formam um tri�ngulo!");
	}
	if(la==lb && lb==lc) {
		System.out.println("O tri�ngulo � um equil�tero.");
	}
	else if(la==lb || lb==lc || la==lc) {
		System.out.println("Tri�ngulo is�sceles.");
	}
	else {
		System.out.println("Tri�ngulo escaleno.");
	}
}
}
