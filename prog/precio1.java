public class precio1 {
	public static void main(String[] args) {
        
        Double precioInicial;
        Double precioFinal;
        Double porcentajeIVA;
        Double resultadoIVA;
        
        precioInicial = 143.22;
        porcentajeIVA = 3.7;
        resultadoIVA = porcentajeIVA / 100;
        precioFinal = precioInicial + ( precioInicial * resultadoIVA ) ;
        
        System.out.println(precioFinal);
		

       
	}
}