/*
	Crea las variables necesarias y asígnales valores para guardar la siguiente información:
	Cuántos días fuiste al gimnasio la semana pasada.
	Cuál es el nombre de tu gimnasio.
	Cuántos kilómetros corriste en la cinta.
	Si el fin de semana tuviste agujetas.
	El día de la semana que más abdominales hiciste, 
	utilizando para ello las siglas (L, M. X, J y V) para identificar los días de la semana.
*/





public class gimnasio{
	public static void main ( String [] args) {

		String nombre; nombre = "GYM";
		Integer dias; dias = 4;
		Float km; km = 10.0f;
		Boolean agujetas; agujetas = true;
		Integer Labdominales, Mabdominales, Xabdominales, Jabdominales, Vabdominales; 
		Labdominales = 10;
		Mabdominales = 20;
		Xabdominales = 30;
		Jabdominales = 40;
		Vabdominales = 50;
		Integer masAbdominales; 
		masAbdominales = Labdominales > Mabdominales > Xabdominales > Jabdominales > Vabdominales;

		System.out.println ( "El gimnasio se llama" + nombre + " al que fui " + dias + 
                     " la semana pasada, corri " + km + " km, y el dia que mas abdominales hice fueron " 
                      + masAbdominales + " y termine la semana con " + agujetas " ." );

	}
}