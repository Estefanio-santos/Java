import java.util.Scanner;

public class Teste {
public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	double salario, desc1, desc2, desc3, resultado1, resultado2, resultado3;
	System.out.println("Insira o valor do sal�rio:");
	salario=teclado.nextDouble();
	desc1=(salario*12.5)/100;
	desc2=(salario*25)/100;
	desc3=salario-1300;
	resultado1=salario-desc1;
	resultado2=salario-desc2;
	resultado3=salario-desc3;
	if(salario>=1000 && salario<2500) {
		System.out.println("O desconto do imposto � de: R$" + desc1 + ". o salario com desconto � de: R$" + resultado1 );
	}
	else if(salario>=2500 && salario<5000) {
		System.out.println("O desconto do imposto � de: R$" +  desc2 + ". O sal�rio com desconto � de: R$" + resultado2 );
	}
	else if(salario>=5000) {
		System.out.println("O desconto do imposto � de: R$" + resultado3 + ". O sal�rio com desconto � de: R$" + desc3 );
	}
	else {
		System.out.println("Voc� est� isento de imposto.");
	}
}
}
