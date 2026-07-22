package aula031_fixacao;

import java.util.Locale;

public class Program {
	public static void main(String[]args) {
		//Inicializa variáveis
		String produto1 = "Computador";
		String produto2 = "Mesa de Tabuleiro";
		
		int idade = 18;
		int codigo = 6767;
		char genero = 'M';
		
		double price1 = 3432.0;
		double price2 = 120.5;
		double measure = 53.234567;
		
		
		//Exibe as infos
		System.out.println("Products: ");
		System.out.printf("%s, which price is $ %.2f%n", produto1, price1);
		System.out.printf("%s, which price is $ %.2f", produto2, price2);
		System.out.printf("%n%nRecord: %d years old, code %d and gender: %c%n%n", idade, codigo, genero);
		System.out.printf("Measure with eight decimanl places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US Decimal Point: %.3f", measure);
	
	}
}
