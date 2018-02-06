import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		for(int i = 299; i >= 101; i--) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}

	}

}
