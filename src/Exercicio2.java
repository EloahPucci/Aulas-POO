import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		System.out.println("Calculando a �rea e o per�metro do ret�ngulo:");
		System.out.println("Digite o valor da base:");
		
		int base = sc.nextInt();
		
		System.out.println("Digite o valor da altura:");
		
		int altura = sc.nextInt();
		
		int area = base * altura;
		int perimetro = 2 * (base + altura);
		
		System.out.println("�rea calculada: " + area + "m�");
		System.out.println("per�metro calculado: " + perimetro + "m�");
		
		sc.close();

	}

}
