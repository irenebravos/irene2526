package ibravos.T1.ejercicios;

public class precio2 {
	public static void main(String[] args) {
        
        Double precioInicial;
        Double precioFinal;
        Double porcentajeIVA;
        Double resultadoIVA;
        Double descuento;
        Double precioIVA;
        
        precioInicial = 133.25;
        porcentajeIVA = 21.0;
        resultadoIVA = porcentajeIVA / 100;
        descuento = 25.3 / 100;
        precioIVA = precioInicial + ( precioInicial * resultadoIVA );
        precioFinal = precioIVA - ( precioIVA * descuento );
        
        System.out.println(precioFinal);
    
	}
}