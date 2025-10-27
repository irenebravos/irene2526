
package ibravos.UT2.examen;
import java.util.Scanner;
import java.util.Random;
public class Ejercicio3{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Producto 1: ");
		String producto1 = teclado.nextLine();
		System.out.print("Producto 2: ");
		String producto2 = teclado.nextLine();
		teclado.close();
		
		Random random = new Random();
		Float limiteInferior = 5f;
		Float limiteSuperior = 17f;
		Float rango = limiteSuperior - limiteInferior;
		Float precio1 = random.nextFloat() * rango + limiteInferior;
		Float precio2 = random.nextFloat() * rango + limiteInferior;
		System.out.printf("\tEl precio de los %s es de %05.2f€.%n", producto1, precio1);
		System.out.printf("\tEl precio de los %s es de %05.2f€.%n", producto2, precio2);
	}
}