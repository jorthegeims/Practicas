package POO2.Predictivo;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lector {

    String texto;
    String[] textoSplit;
    int N;
    String r[];
    
    public String[] getBD() {
        return r;
    }

    public Lector(String url) {

        
        try {

            Scanner read = new Scanner(new java.io.File(url));

            texto = read.nextLine();
            textoSplit = texto.split(" ");

            
            

            N = Integer.parseInt(read.nextLine());

            r = new String[N];

            for (int i = 0; i < r.length; i++) {

                r[i] = read.nextLine();
                
            }
        } catch(FileNotFoundException xd){

        System.err.println(xd);

        }    

    }

//    public void Leer(string url){}

}
