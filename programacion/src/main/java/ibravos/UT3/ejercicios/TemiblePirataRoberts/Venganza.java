package ibravos.UT3.ejercicios.TemiblePirataRoberts;

import java.util.Random;

public class Venganza{
    public static void main(String[] args) throws Exception{
        Integer botin = 0;	//Monedas de oro
        Random dado = new Random();
        System.out.println("\"A la mar marineros!!\"");
        Integer vigia;
        do{
            System.out.println("\nSeguimos navegando");
            vigia = dado.nextInt(10);
            if (vigia < 5)
                System.out.println("Solo veo mar");
            else if (vigia < 8) {
                System.out.println("Presa a la vista");
                botin += dado.nextInt(26) + 1; //entre 0 y 25
                System.out.println("Ya tenemos " + botin + " monedas.");
            }
            else if (vigia < 9){
                System.out.println("Problemas a la vista");
                vigia = dado.nextInt(2);
                if (vigia == 0)
                    System.out.println("Enemigo a BABOR");
                else
                    System.out.println("Enemigo a ESTRIBOR");
                //Viramos 180 grados
                for(int i = 0; i < 180; i += 10){
                    System.out.printf("Llevamos %d grados%n", i);
                    Thread.sleep(250);
                }
                System.out.println("Rumbo cambiado");
            }
            else{
                System.out.println("Por allí resopla");
                System.out.println("¡Buen viaje guapetonas!");
            }

            Thread.sleep(1000);
        }
        while(botin < 100);

        System.out.println("Me voy a casa a gastarme el botín");
    }
}