import java.util.Scanner;

public class ConsumoEnergia {
public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	double slm, vlkw, qtkw, tct, tdt;
//slm=sal�rio m�nimo, vlkw=valor kw, qtkw=quantidade de kw, tct=total da conta, tdt=total desconto.//
	System.out.println("Insira o valor do sal�rio: ");
	slm=teclado.nextDouble();
	System.out.println("Quantos kw foram consumidos?");
	qtkw=teclado.nextDouble();
	vlkw=slm/700;
	tct=vlkw*qtkw;
	tdt=tct*0.9;
	System.out.println("Cada kw vale: " + vlkw);
	System.out.println("O total da conta � de: " + tct);
	System.out.println("O total com desconto � igual �: " + tdt);
}
}
