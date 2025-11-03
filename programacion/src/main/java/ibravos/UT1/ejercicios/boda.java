package ibravos.UT1.ejercicios;

public class boda {
	public static void main(String[] args) {
        
        Boolean respeto;
        Boolean amor;
        Boolean rico;
        Boolean divertido;
        Boolean boda;
       
        respeto = true;
        amor = true;
        rico = true;
        divertido = false;
         
        boda = respeto && amor && rico && divertido;
        
        System.out.println(boda);
        
	}
}