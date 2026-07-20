//Seção 4 - Aula 31

import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		
		//Sem quebra de Linha
		System.out.print("---");
		System.out.print("Hello World");
		System.out.print("---");
		
		System.out.println();
		
		//Com quebra de linha
		System.out.println("---");
		System.out.println("Hello World");
		System.out.println("---");
		
		//Declarando variável
		int idade = 32;
		double salário = 1621.24;
		double valorDeMercado = 1987.8762;
		
		System.out.println("Idade: " + idade + " anos");
		//Concatenação de elementos "+"
		System.out.printf("Printf Idade: %d anos%n", idade);
		System.out.printf("Salário: R$%.4f%n", salário);
		//----
		Locale.setDefault(Locale.US);
		//Faz o separador de decimais ser lido 
		//como "10.024" invés de "10,024" por exemplo.
		System.out.printf("Valor de Mercado: R$%.2f%n", valorDeMercado);
		//%n -> Quebra de linha
		/*%.2f -> Indica que eu quero que o número seja
		 * com 2 casas  decimais
		*/
		//System.out.printf -> exibições formatadas
		System.out.println("-- DADOS --");
		String name = "RyanGit";
		int idadeDate = 18;
		double renda = 1111.11;
		String languageProgram = "Java";
		char gender = 'M';
		boolean workSituacion = true;
		
		System.out.printf("Name: %s%nIdade: %d%nGênero: %s%nRenda: R$%.2f%nLinguagem de Programação: %s%nTrabalhando? %B%n", name, idadeDate, gender, renda, languageProgram, workSituacion );
		
	}

}
