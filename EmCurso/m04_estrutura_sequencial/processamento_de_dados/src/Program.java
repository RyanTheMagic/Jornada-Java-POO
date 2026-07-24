
public class Program {
	public static void main(String[]args) {
		int x,y;
		
		x = 5;
		
		y = x * 25;
		
		System.out.println("INTEIROS");
		System.out.printf("Bruto: %d%n", x);
		System.out.printf("Expressão X * 25: %d%n%n", y);
		
		int numberInt;
		double numberDouble;
		
		numberInt = 10;
		numberDouble = numberInt * 25;
		
		System.out.println("INTEIRO + DOUBLE");
		System.out.printf("Bruto: %d%n", numberInt);
		System.out.printf("Expressão: " + numberDouble);
		
		//Trapézio
		//Inicializa variáveis
		double b = 6.0;
		double h = 5.0;
		double bsao = 8.0;
				
		double areaTrapezio = ((b + bsao) * h)/2.0 ;
				
		System.out.println("TRAPÉZIO");
		System.out.println("b = 6");
		System.out.println("h = 5");
		System.out.println("B = 8");
		System.out.println("Área do Trapezio: " + areaTrapezio);
				
		int p, j;
		double resultado;
				
		p = 5;
		j = 2;
				
		resultado = (double) p / j;
				
		System.out.println();
		System.out.println("DIVISAO");
		System.out.println(resultado);
		System.out.println();
				
		double m;
		int n;
				
		m = 5.7;
		n = (int) m;
				
		System.out.println(n);
		System.out.println();
		
	}
}
