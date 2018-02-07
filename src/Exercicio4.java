import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		System.out.println("Digite 04 números inteiros:");
		
		double n1, n2, n3, n4, soma, media;
		
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		n3 = sc.nextDouble();
		n4 = sc.nextDouble();
		
		soma = n1 + n2+ n3 + n4;
		media = soma / 4;
		
		System.out.printf("A média dos valores digitados é: %.2f\n", media);
		
		if(media >= 6.0) {
			System.out.println("APROVADO!");
		} else {
			System.out.println("REPROVADO!");
		}
		

	}

}