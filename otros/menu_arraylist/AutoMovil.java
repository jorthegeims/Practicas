package menu_arraylist;

	public class AutoMovil 
	{
		String marca;
	    String color;
		
	public

	    AutoMovil() // Constructor default
	    {
		    
		 
		    
	        System.out.println("Objeto de Clase AutoMovil creado sin datos en color y # en marca");
	        this.marca="#";
	        //System.out.println("Detengo, para seguir tipear un número 1x1");
	        //Leer.hasNextLine();
	        //int i=Leer.nextInt();
	        //Leer.close();
	    }

	    AutoMovil(String lmarca, String color) //Constructor Sobrecargado
	    {
	        marca=lmarca;
	        this.color=color;
	        System.out.println("\nauto inicializado por constructor, marca: "+ this.marca +" pasado como parametro");
	        System.out.println("auto inicializado por constructor, color: "+this.color +" pasado como parametro\n");

	    }
	   
	    void set_marca(String lmarca) //Es un setter
	    {
	        this.marca=lmarca;
	    }
	    String get_marca() //Es un getter
	    {        
	        return marca;
	    }
	    void set_color(String lcolor) //Es un setter
	    {
	        this.color=lcolor;
	    }
	    String get_color() //Es un getter
	    {
	        return color;
	    }}