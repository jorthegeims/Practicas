package POO2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Calculadora {

    public Calculadora(){}
    
    public boolean Primo(int n){

        return n%2 != 0;

    }
//mal hecho
    public int sumaMultiplo(int n){

        int multiplo1 = 3;
        int multiplo2 = 5;
        int multiplos = multiplo1 + multiplo2;

        for (int i = 0; i < n; i++) {
            
            if (multiplo2*i < n) {
                multiplo2 = multiplo2*i;
            } else multiplo2 = 0;

            if (multiplo1*i < n) {
                multiplo1 = multiplo1*i;
            } else multiplo1 = 0;

            multiplos += multiplo2 + multiplo1;
        }

        return multiplos;
    }

    public boolean ListaOrdenada(int[] ListaOrdenada){

        int n = ListaOrdenada[0];

        for (int i : ListaOrdenada) {

            //System.out.println("n: "+ n);
            //System.out.println("i: "+i);

            if (n < i) {
                return false;
            }

            n = i;

        }

        return true;
        
    }

    public int SumaPar(int[] array){
        int n=0;

        for (int i = 0; i < array.length; i += 2) {
            n+=array[i];
        }



        return n;
    }

    public int[][] SumaDeMatriz(int[][] matris1, int[][] matris2){

        int n = matris1.length;

        int[][] matrisT= new int[n][n];
        

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrisT[i][j] = matris1[i][j] + matris2[i][j];
            }
            
        }



        return matrisT;
    }

    public Map ContadorCaracter(String string){

        //ArrayList list = new ArrayList<Integer>();
        Map mapa = new HashMap<String, Integer>();

        for (char caracter : string.toCharArray()) {
            if (mapa.containsKey(caracter)) {
                mapa.put(caracter, 1);
            } else mapa.put(caracter, (int) mapa.get(caracter)+1);
        }

      



        return mapa;
    }

}
