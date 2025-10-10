public class alarma1 {
	public static void main(String[] args) {
        
        Boolean alarmaActivada;
        Boolean accesoAbierto;
        Boolean alarmaSonando;
       
        alarmaActivada = true;
        accesoAbierto = false;
         
        alarmaSonando = alarmaActivada && accesoAbierto;
        
        System.out.println(alarmaSonando);
        
	}
}