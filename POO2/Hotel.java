package POO2;

import java.util.ArrayList;

import POO2.Hotel.Habitaciones;

public class Hotel {

    int CHabitacion;

    ArrayList<Habitaciones> listHabitaciones;
    
    public Hotel(int Habitaciones){

        CHabitacion = Habitaciones;
        listHabitaciones = new ArrayList<Habitaciones>(CHabitacion);

    }

    public void ocuparHabitacionCon(int mayores, int menores){

        listHabitaciones.add(new Habitaciones(mayores, menores));

    }

    public int getHabitantes(){

        int total = 0;

        for (Habitaciones habitacion : listHabitaciones) {
            total+= habitacion.getHabitantes();
        }

        return total;

    }

    public int contarHabitacionesCon(int mayores){

        int total = 0;
        for (Habitaciones habitaciones : listHabitaciones) {
            
                    if (habitaciones.Mayor==mayores) {
                        total++;
                    }
        }

        return total;

    }

    public int[] listHabitantes(){

        int[] total = new int[9];

        for (Habitaciones habitaciones : listHabitaciones) {
            
            int habitantes = habitaciones.getHabitantes();

                switch(habitantes) {
            case 0:
                total[0]++;
                break;
            case 1:

                total[1]++;
                break;
            case 2:
                total[2]++;
                break;
            case 3:
                total[3]++;
                break;
                
            case 4:
                total[4]++;
                break;
            case 5:
                total[5]++;
                break;
            case 6:
                total[6]++;
                break;
            case 7:
                total[7]++;
                break;
            case 8:
                total[8]++;
                break;
            }

        }

        return total;

    }


    public class Habitaciones {

        int Mayor;
        int Menor;
    
        public Habitaciones(int Mayor,int Menor){

            this.Mayor = Mayor;
            this.Menor = Menor;

        }

        public int getHabitantes(){

        return Mayor + Menor;

        }
    
        
    }

}
