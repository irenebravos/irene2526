
package ibravos.UT2.examen;
import java.util.Random;
import java.lang.Math;
public class Ejercicio4{
	public static void main(String[] args) {
		Integer dado1, dado2, dado3, maximo, minimo;
		Random random = new Random();
		
		dado1 = random.nextInt(5) + 1;
		dado2 = random.nextInt(5) + 1;
		dado3 = random.nextInt(5) + 1;
		
		maximo = Math.max(dado1, Math.max(dado2, dado3));
		minimo = Math.min(dado1, Math.max(dado2, dado3));
		System.out.println("El mayor valor obtenido ha sido: " + maximo + " ***");
		System.out.println("El menor valor obtenido ha sido: \"" + minimo + "\" ***");
		
	}
}