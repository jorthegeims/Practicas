package POO2.practica_lista;

import java.util.Random;

public class hola {

    //alan

    public static boolean alumnos(int[] vector, int numero) {

        for (int i : vector) {

            if (i==numero) {
                
                return true;

            }
        }

        return false;

        }

        //mario

        public static void masfeo(int[] vector, int numero) {

            int pico=vector[0];

            for (int i : vector) {
    
                if (i>pico) {
                    
                    pico = i;
    
                } else break;


            }
    
        }

        public static void main(String[] args) {

            long xd = System.nanoTime();
            long x = 0;

            int i = 0;

            while ( i < 100000000) {
                
                x = i*i;
                
                i++;
            }



            

            long xd1 = System.nanoTime();
            System.out.println("tiempo de ejecucion: " + (double)(xd1 - xd)*Math.pow(10, -9));

            

            for (i = 0; i < 100000000; i++) {
                x = i*i;
            }

            long xd2 = System.nanoTime();

            System.out.println("tiempo de ejecucion: " + (double)(xd2 - xd)*Math.pow(10, -9));

            i = 0;

            do {
                

                x = i*i;

                i++;
            } while(i < 100000000);

            long xdfinal = System.nanoTime();

            System.out.println("tiempo de ejecucion: " + (double)(xdfinal - xd)*Math.pow(10, -9));
        }


}
