package menu_arraylist;
import java.util.Scanner;
import java.util.ArrayList;


public class MenuABM1 {
	    //AutoMovil listAuto[] = new AutoMovil[4];	
		//AutoMovil listNueva[] = new AutoMovil[4];
	Scanner Leer=new Scanner(System.in);
	
	ArrayList<AutoMovil> listAuto = new ArrayList<>();
		
		
        Scanner teclado = new  Scanner(System.in);
public MenuABM1(){ //Constructor
}
public void menu() {
	
	int opc;
	boolean salir = false;
	System.out.println("Ingreso al menu del programa reserva natural");
	
while(!salir) {

		System.out.println( "MENU ABM AUTOS " );
        System.out.println( "1 - Ingresar auto" );
        System.out.println( "2 - Modificar auto" );
        System.out.println( "3 - Dar de baja auto" );
        System.out.println( "4 - Ver lista de autos");
        System.out.println( "5 - Salir");
        System.out.println( "Ingrese una opcion: ");
       
        opc=Leer.nextInt();
     
   
switch (opc){

case 1 : 
	this.IngresarAuto();
	break;
case 2: 
	 if (this.modificarAuto()) {
         System.out.println( "La modificacion se ha llevado a cabo con exito");}
     else {
         System.out.println( "El auto ingresado no se encuentra en la lista" );
     }
     System.out.println("Detengo, para seguir tipear un número");
     teclado.nextInt();
     break;
 case 3:
     if (this.eliminaAuto()){
         System.out.println( "La eliminacion se ha llevado a cabo con exito");
     } else {
         System.out.println( "El auto ingresado no se encuentra en la lista");
     
     System.out.println("Detengo, para seguir tipear un número");
     teclado.nextInt();
     break;}
 case 4:
     this.mostrar();
     break;
 case 5:
     salir = true;
     System.out.println("FIN");
     break;
 default:
     System.out.println("Opción no válida");}

}
}

public void IngresarAuto() {
	String mar;
	String col;
	
	 System.out.println( "Ingrese la marca del auto: ");         
     mar=teclado.next();       
     System.out.println( "Ingrese el color del auto: ");              
     col=teclado.next(); 
     
	listAuto.add(new AutoMovil(mar,col));
		  
	
	
}
public void mostrar() {
	 System.out.println("\n\nContenido del ArrayList de Objetos");
	 for(AutoMovil Aut : listAuto) {
		 
		boolean b= (Aut.get_marca()).equals("#");
		
		if(b== true) {
			break;}
		System.out.println(Aut.get_marca()+ ""+ Aut.get_color());
		
		}
	 System.out.println("Detengo, para seguir tipear un número");
     teclado.nextInt();
     
}
public boolean modificarAuto( ) { 
    String mar="";
    String col="";
  
    System.out.println( "Ingrese la marca del auto que desea modificar: ");
    mar = Leer.next();
 
    System.out.println( "Ingrese el nuevo color del auto marca :"+ mar);
    col = Leer.next();

    for (AutoMovil auto : listAuto) {

        if (auto.get_marca().equals(mar)) {
                auto.set_color(col);
                return true;
        }

    }

    System.out.println("No se encontró el auto con la marca " + mar);
   return false;
}
    public boolean eliminaAuto(){
    	
    	String mar="";
        boolean flag= false;
        System.out.println( "Ingrese la marca del auto que desea dar de baja: ");
        mar=Leer.next();
        AutoMovil autos =new AutoMovil(mar,"");
    
    for(AutoMovil 	Aut : listAuto )
    {
    	if(Aut.get_marca().equals(mar))        
        { 
    		Aut.set_marca("*");
    		flag = true;        	}			
    	//System.out.println("Paso1"+listAuto[i].get_marca() + "  " +listAuto[i].get_color());
    else 
	{ 
    	
         int s =  listAuto.indexOf(autos);
         if (s != -1) {
    	listAuto.remove(s);
    	listAuto.add(Aut);
    	
       }
    
    	//System.out.println("Paso4"+listAuto[i].get_marca() + "  " +listAuto[i].get_color());
		//System.out.println("Paso3"+ i + j);
	}   }    	     
    return flag;}
}