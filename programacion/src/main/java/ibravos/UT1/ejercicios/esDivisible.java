package ibravos.UT1.ejercicios;

public class esDivisible
{
	public static void main(String[] args) {
	    
	    Integer primero1;
	    Integer segundo1;
	    Boolean  esDivisible1;
	    
	    Integer primero2;
	    Integer segundo2;
	    Boolean  esDivisible2;
	    
	    
	    primero1 = 4;
	    segundo1 = 2;
	    esDivisible1 = primero1 % segundo1 == 0;
	    
	    primero2 = 4;
	    segundo2 = 3;
	    esDivisible2 = primero2 % segundo2 == 0; 
	    
		System.out.println( esDivisible1 );
		System.out.println( esDivisible2 );
	}
}