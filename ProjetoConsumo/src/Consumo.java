import java.util.Scanner;

public class Consumo {
public static void main(String[] args) {
	Scanner teclado =new Scanner(System.in);
	double km, litros, media;
	String nome;
	System.out.println("seja bem-vindo ao meu programa de consumo m�dio");
	System.out.println("qual o seu nome?");
	nome=teclado.nextLine();
	System.out.println("Muito bem! " + nome + "Quantos km o ve�culo percorreu?");
	km=teclado.nextDouble();
	System.out.println("qual foi a quantidade de combust�vel utilizado?");
	litros=teclado.nextDouble();
	media=km/litros;
	System.out.println("A m�dia de consumo foi: " + media + " litros, por km rodado.");
	System.out.println("Economize sua gasolina " + nome + ", e seja amigo do meio ambiente.");
}
}
