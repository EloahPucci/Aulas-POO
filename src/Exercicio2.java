import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		System.out.println("Calculando a área e o perímetro do retângulo:");
		System.out.println("Digite o valor da base:");
		
		int base = sc.nextInt();
		
		System.out.println("Digite o valor da altura:");
		
		int altura = sc.nextInt();
		
		int area = base * altura;
		int perimetro = 2 * (base + altura);
		
		System.out.println("Área calculada: " + area + "m²");
		System.out.println("perímetro calculado: " + perimetro + "m²");
		
		sc.close();

	}

}
