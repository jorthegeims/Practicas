package POO2;

import java.util.HashMap;
import java.util.Map;

public class Practica1 {

	public static void main(String[] args) {

		Calculadora calculadora1 = new Calculadora();

		if(calculadora1.Primo(7)){

			System.out.println("es primo");

		}

		System.out.println(calculadora1.ListaOrdenada(new int[]{5,4,4,3,2,1}));

		System.out.println(calculadora1.SumaPar(new int[]{1, 2, 13 ,4, 8, 6}));

		int[][] matriz1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};         
		int[][] matriz2 = {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}};

		int[][] matrizT = calculadora1.SumaDeMatriz(matriz1, matriz2);

		for (int i = 0; i < matrizT.length; i++) {
            for (int j = 0; j < matrizT.length; j++) {
                System.out.print(matrizT[i][j]+" ");
            }
			System.out.println("");
            
        }

		Hotel hotel = new Hotel(8);

		hotel.ocuparHabitacionCon(3, 4);
		hotel.ocuparHabitacionCon(3, 4);
		hotel.ocuparHabitacionCon(3, 3);
		hotel.ocuparHabitacionCon(3, 2);
		hotel.ocuparHabitacionCon(2, 4);
		hotel.ocuparHabitacionCon(4, 4);

		System.out.println(hotel.getHabitantes());
		System.out.println(hotel.contarHabitacionesCon(3));
		for (int x : hotel.listHabitantes()) {
			System.out.println(x);
		}

	}


}

