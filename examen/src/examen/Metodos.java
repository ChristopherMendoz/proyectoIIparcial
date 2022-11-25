package examen;

public class Metodos {
	 int A,C, id, edad;
	   String B; 
	   String nombre;
	   String apellidos;
	   char sexo;
	     
	   public Metodos(){
	 
	   }
	    public void setId(int id) {
	        this.id = id;
	    }
	    public int getId() {
	        return id;
	    }
	    public void setA(int A) {
	        this.A = A;
	    }
	    public int getA() {
	        return A;
	    }
	    public void setC(int C) {
	        this.C = C;
	    }
	    public int getC() {
	        return C;
	    }
	   public void setB(String B){
		   this.B=B;
		   }
	   public String getB(){
		   return B;
		   }
	    public void setNombre(String nombre) {
	            this.nombre = nombre;   
	    }
	    public String getNombre() {
	        return nombre;
	    }
	    public void setApellidos(String apellidos) {
	        this.apellidos = apellidos;
	    }
	    public String getApellidos() {
	        return apellidos;
	    }
	    public void setEdad(int edad) {
	        this.edad = edad;
	    }
	    public int getEdad() {
	        return edad;
	    }
	    public void setSexo(char sexo) {
	        this.sexo = sexo;
	    }
	    public char getSexo() {
	        return sexo;
	    }
	   public void Menu(){
	    System.out.println(" Menu Principal");
	    System.out.println("1.- Ingresar venta");
	    System.out.println("2.- Actualizar Stock");
	    System.out.println("3.- Informe de Stock");
	    System.out.println("4.- Informe de Ventas");
	    System.out.println("5.- Consulta de Precio");
	    System.out.println("6.- Consulta de Stock");
	    System.out.println("7.- Consulta de Clientes");
	    System.out.println("8.- Salir");
	   }

	    @Override
	    public String toString() {
	        return this.getNombre() + " "
	                + this.getApellidos () + "| " +"Edad " + this.getEdad()+ "| "
	                + "Sexo "+this.getSexo()+"|" + " ha comprado: "+this.getA()+ " Articulos de "+this.getB()+".|\t";
	    } 
	 
	
}
