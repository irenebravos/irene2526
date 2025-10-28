
package ibravos.UT2.examen;

import java.util.Scanner;

public class Ejercicio2{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Dime tu nombre: ");
		String nombre = teclado.nextLine();
		System.out.println("Tu nombre tiene " + nombre.length() + " letras.");
		System.out.println("En el tercer lugar está la letra " + nombre.charAt(2) + ".");
		System.out.println("Entre las posiciones 2 y 4 están " + nombre.substring(1,4) + ".");
		System.out.println("En mayúsculas es " + nombre.toUpperCase() + ".");
		Boolean esMaria = nombre.equals("María");
		System.out.println("Te llamas María: " + esMaria + ".");
		teclado.close();
	}
}