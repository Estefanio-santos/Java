import java.util.Random;

public class Gerador {
public static void main(String[] args) {
	Random random=new Random();
	int numero;
	numero=random.nextInt(100);
	System.out.println("numero gerado: " + numero);
}
}
