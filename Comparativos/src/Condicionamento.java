import java.util.Scanner;

public class Condicionamento {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double nota1, nota2, nota3, nota4, media;
		System.out.println("Insira a nota 1: ");
		nota1 = teclado.nextDouble();
		System.out.println("Insira a nota 2: ");
		nota2 = teclado.nextDouble();
		System.out.println("Insira a nota 3: ");
		nota3=teclado.nextDouble();
		System.out.println("Insira a nota 4: ");
		nota4=teclado.nextDouble();
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		System	.out.println("A m�dia entre as notas informadas � de: " + media);
		if(media>=6) {
		System.out.println("voc� foi aprovado, por�m estude mais!"); }
		else {
			System.out.println("Que pena, voc� foi reprovado.");
}
}
}