import java.util.Scanner;

public class AreaQuadrado {
public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	Double a, b	;
	System.out.println("Vamos calcular a �rea de um quadrado:");
	System.out.println("Digite o valor de qualquer um dos lados:");
	a=teclado.nextDouble();
	b=Math.pow(a,2);
	System.out.println("A �rea do quadrado � igual �: " + b);
}
}
