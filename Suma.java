import java.util.Scanner;

public class Suma {

	public static void main(String[] args) {
		int a, b, c;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Introduce el primer n�mero: ");
		a = teclado.nextInt();
		
		System.out.print("Introduce el segundo n�mero: ");
		b = teclado.nextInt();
		
		c = suma(a, b);
		System.out.println("La suma de los dos n�meros es:  " + c);
		
	}

	static int suma(int a, int b) {
		
		return a+b;
	}

}
