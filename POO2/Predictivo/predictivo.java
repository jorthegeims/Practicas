package POO2.Predictivo;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class predictivo {

    

    public static void main(String[] args) {

        Lector lea = new Lector("C:\\a\\archivoaleer.in");

        BaseDatos baseDatos = new BaseDatos(lea.getBD());

        

        String texto;
        String[] textoSplit;
        int N;
        String r[];
        

        try {
            Scanner read = new Scanner(new java.io.File("C:\\a\\archivoaleer.in"));

            texto = read.nextLine();
            textoSplit = texto.split(" ");

            
            

            N = Integer.parseInt(read.nextLine());

            r = new String[N];

            for (int i = 0; i < r.length; i++) {

                r[i] = read.nextLine();

            }    

            int cont = 0;

            for (int i = 2; i < textoSplit.length; i++) {
                
                String primeraPalabra = textoSplit[i-2];
                String segundaPalabra = textoSplit[i-1];
                String terceraPalabra = textoSplit[i];

                if(metodo(primeraPalabra,segundaPalabra,terceraPalabra, r)){

                    cont = 1;
                    break;

                }
                
            }

            System.out.println(cont);


    } catch(FileNotFoundException xd){

        System.err.println(xd);

        }    

        


    }

    private static boolean metodo(String primeraPalabra, String segundaPalabra, String terceraPalabra, String[] r) {
        // TODO Auto-generated method stub

        String tresPalabras = primeraPalabra + " " + segundaPalabra + " " + terceraPalabra;

        for (int i = 0; i < r.length; i++) {

            if (tresPalabras.equals(r[i])) {
                return true;
            }
            
        }

        return false;

    }


    

}