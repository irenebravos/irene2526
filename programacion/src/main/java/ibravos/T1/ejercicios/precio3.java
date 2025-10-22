package ibravos.T1.ejercicios;


public class precio3 {
	public static void main(String[] args) {
        
        Double precioInicial;
        Double precioFinal;
        Double porcentajeIVA;
        Double resultadoIVA;
        Double descuento;
        Double precioIVA;
        
        precioInicial = 50.0;
        porcentajeIVA = 10.0;
        resultadoIVA = porcentajeIVA / 100;
        descuento = 5.0 / 100;
        precioIVA = precioInicial + ( precioInicial * resultadoIVA );
        precioFinal = precioIVA - ( precioIVA * descuento );
        
        System.out.println(precioFinal);
    
	}
}