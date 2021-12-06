import java.util.Scanner;

public class Media2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double nota1, nota2, media;
		System.out.println("Insira nota 1:");
		nota1 = teclado.nextDouble();
		System.out.println("Insira nota 2:");
		nota2 = teclado.nextDouble();
		media = (nota1 + nota2) / 2;
		System.out.println("A média entre as notas informadas é de: " + media);
		if(media >= 8 && media <= 10) {
			System.out.println("Parabéns, você foi aprovado com louvor!");
		}
		else if(media >= 6 && media <8) {
			System.out.println("Você foi aprovado, porém estude mais!");
		}
		else if(media >= 5 && media <6) {
			System.out.println("Você está de recuperação, ainda tem chance!");
		}
		else {
			System.out.println("Que pena, você foi reprovado!");
		}
}
}