package POO2.pixel_ejercicio;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Achicador {



    public static void main(String[] args) {
        
        int q,n,m;
        Imagen imagenGrande;
        int[][] red;
        int[][] green;
        int[][] blue;
        int[] k;
        int[] l;
        Imagen[] imagenesChicas;

        // System.err.println("metodo main");


        try {
            Scanner read = new Scanner(new java.io.File("C:\\a\\archivoaleer.in"));

            

            String[] linea1 = read.nextLine().split(" ");

            n = Integer.parseInt(linea1[0]);
            m = Integer.parseInt(linea1[1]);

            

            imagenGrande = new Imagen(n, m);
            q = Integer.parseInt(linea1[2]);

            imagenesChicas = new Imagen[q];

            red = new int[n][m];
            green = new int[n][m];
            blue = new int[n][m];

            //esta parte recorre red

            // System.out.println("el primer for");

            for (int i = 0; i < (n); i++) {
                
                String[] lineaN = read.nextLine().split(" ");

                for (int j = 0; j < (m); j++) {
                    
                    red[i][j] = Integer.parseInt(lineaN[j]);

                }

            }

            

            for (int i = 0; i < (n); i++) {
                
                String[] lineaN = read.nextLine().split(" ");

                for (int j = 0; j < (m); j++) {
                    
                    green[i][j] = Integer.parseInt(lineaN[j]);

                }

            }

            for (int i = 0; i < (n); i++) {
                
                String[] lineaN = read.nextLine().split(" ");

                for (int j = 0; j < (m); j++) {
                    
                    blue[i][j] = Integer.parseInt(lineaN[j]);

                }

            }

            int x = 0;
            k = new int[q];
            l = new int[q];

            // System.out.println("while");

            while (read.hasNextLine()) {

                String[] valoresKL = read.nextLine().split(" ");

                k[x] = Integer.parseInt(valoresKL[x]);
                l[x] = Integer.parseInt(valoresKL[x]);

                imagenesChicas[x] = new Imagen(k[x], l[x]);

            }

            read.close();

            // System.out.println("for anidado");

            

            for (int i = 0; i < n; i++) {

                // System.out.println("hola?");

                for (int j = 0; j < m; j++) {

                    //System.out.println("valores " + red[i][j] + " " + green[i][j] + " " + blue[i][j] + " " + i + " " + j);
    
                    imagenGrande.setPixel(red[i][j], green[i][j], blue[i][j], i , j);
    
                }
    
            }

            System.out.println("fin del try");

            imagenGrande.getImagen();
            

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        

        

        









    }

}
