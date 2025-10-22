package ibravos.T2.ejerciciosEyS;


import java.util.Scanner;

public class PScanner2{
	public static void main(String[] args) {
	  Scanner teclado = new Scanner(System.in);
	  Integer edad;
		System.out.print("¿Cuál es su edad? ");
		//edad = teclado.nextInt();
		edad = Integer.valueOf(teclado.nextLine());
		System.out.printf("Su edad es de %d años.", edad);
		teclado.close();
	}
}