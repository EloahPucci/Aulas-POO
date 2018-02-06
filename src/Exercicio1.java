import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		System.out.println("Digite um número inteiro:");
		
		int x = sc.nextInt();
		
		System.out.println("Você digitou o número: " + x);
		
		sc.close();

	}

}
