package ibravos.UT2.ejerciciosEyS;


import java.util.Scanner;  // Importamos la clase

class ProgramaScanner {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);  // Creamos el objeto Scanner
    System.out.print("Nombre: ");

    String nombre = teclado.nextLine();  // Leemos el teclado hasta que pulsen ENTER
    System.out.println("El nombre es: " + nombre);
    teclado.close();  // Liberamos la memoria
  }
}