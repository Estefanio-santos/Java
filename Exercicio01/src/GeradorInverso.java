import java.util.Scanner;

public class GeradorInverso {
public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	int novo, numero, unidade, dezena, centena, resto;
	
	String nome;
	System.out.println("Boas vindas ao meu gerador inverso de números. Qual é o seu nome?");
	nome=teclado.nextLine();
	System.out.println("Olá, " + nome + "! Tudo bem?");
	System.out.println("Digite um número de 3 dígitos");
	numero=teclado.nextInt();
	centena=numero/100;
	resto=numero%100;
	dezena=resto/10;
	unidade=resto%10;
	novo=unidade*100+dezena*10+centena;
	System.out.println("O novo numero será " + novo);
	System.out.println("Boa sorte " + nome + ".");
}
}
