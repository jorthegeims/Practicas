package POO2.practica_lista;
import java.lang.reflect.Array;
import java.util.Arrays;

public class sublista {

    public static void main(String[] args) {

        int[] L1= {22, 14, 6};
        int[] L2= {39, 41, 17, 22, 14, 6, 3, 11, 73, 81};
        int[] L3= {39, 41, 22, 17, 14, 3, 11, 73, 6, 81};

        System.out.println(sublistarda(L1,L3));

    }

    private static boolean sublistarda(int[] l1, int[] l2) {

        for (int i = 0; i < l2.length-2; i++) {

            int[] Lx = {l2[i],l2[i+1],l2[i+2]};

            if (Arrays.compare(l1,Lx)==0) {
                return true;
            }

        }

        return false;

    }

    public static int cont = 1;

}
