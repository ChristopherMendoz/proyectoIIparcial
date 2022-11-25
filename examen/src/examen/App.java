package examen;
import java.io.*;
import java.util.Scanner;

public class App {
	public static String []P;
	   public static int []N;
	   public static int [][]M;
	   public static int []C;
	   public static String []D;
	   public static int []E; 
	   public static int []F;
	   public static String []G;
	   public static String x,SALIR,r,L;
	   public static int f,z,c,cont,op,i;
	   public static int cantcompra,j,tcompra,aux,cantmax,cant;
	   public static Metodos ho=new Metodos();
	   public static String idPersona; 
	   public static int id=0;
	   public static String nombrePersona=""; 
	   public static String apellidoPersona=""; 
	   public static String edadPersona="";
	   public static int edadEntera=0; 
	   public static char sexoPersona='M';
	   public static int longitudRegistro =110;
	   public static RandomAccessFile archivo=null;
	   public static byte []array=null;
	   public static ByteArrayOutputStream escribir=null;
	   public static ObjectOutputStream salida=null;
	   public static ByteArrayInputStream leer=null;
	   public static ObjectInputStream entrada = null;


	   public static void main(String args[]){
	     Scanner s=new Scanner(System.in);

	     P=new String[11];
	     N=new int[11];
	     M=new int[11][3];
	     C=new int[100];
	     D=new String[100];
	     E=new int[100];
	     F=new int[100];
	     G=new String[100];

	N[0]=00; P[0]="PAQUETE COCACOLA";         M[0][0]=350; M[0][1]=20;
	N[1]=01; P[1]="PAQUETE RON PLATA";        M[1][0]=650; M[1][1]=10;
	N[2]=02; P[2]="PAQUETE DE PAPAS ZIBAS";   M[2][0]=300; M[2][1]=15;
	N[3]=03; P[3]="BOTELLAS DE AGUA";         M[3][0]=120; M[3][1]=30;
	N[4]=04; P[4]="SIX PACK TOÃ‘A PEQUE";      M[4][0]=240; M[4][1]=40;
	N[5]=05; P[5]="LICOR FLOR DE CAÃ‘A";       M[5][0]=180; M[5][1]=15;
	N[6]=06; P[6]="PAQUETE DE PEPSI";         M[6][0]=250; M[6][1]=24;
	N[7]=07; P[7]="SIX PACK VICTORIA FROST";  M[7][0]=380; M[7][1]=55;
	N[8]=10; P[8]="SIX PACK TOÃ‘A LATA";       M[8][0]=560; M[8][1]=26;
	N[9]=11; P[9]="CAJA COM TOÃ‘A LITRO ";     M[9][0]=850; M[9][1]=10;
	 


	 try{
	  System.out.println("       " + "|CODIGO| DESCRIPCION |PRECIO DE VENTA $|STOCK |");
	   for(i=0;i<=9;i++){
	    System.out.println("\t"+N[i] + "\t"+P[i] + "\t "+M[i][0] + "\t "+M[i][1]);
	   }

	System.out.println("  ");
	do{
	ho.Menu();
	    do{
	     System.out.println("Seleccione su opcion");
	      while(!s.hasNextInt()){
	      s.next();
	      System.out.println("Seleccione una opcion valida. Por favor");
	      }
	     op=s.nextInt();
	    }while(op<1 || op>8);
	     switch(op){
	       case 1:{
	          do{
	           do{
	             System.out.println("Ingrese el codigo del articulo.");
	               while(!s.hasNextInt()){
	               s.next();
	               System.out.println("Seleccione una opcion valida. Por favor");
	               }
	             z=s.nextInt();
	           }while(z == N[0] && z == N[1] && z == N[2] && z == N[3] && z == N[4] && z == N[5] && z == N[6] && z == N[7] && z == N[8] && z == N[9]);
	              if(z != 00 && z!=01 && z != 02 && z != 03 && z != 04 && z != 05 && z != 06 && z != 07 && z != 10 && z != 11){
			   System.out.println("ERROR. Debe ingresar un codigo valido");
			  }else{
	               System.out.println("Ingrese cuantos productos quiere comprar");
	               while(!s.hasNextInt()){
	               s.next();
	               System.out.println("Seleccione una opcion valida. Por favor");
	               }
	                cantcompra=s.nextInt();
	                ho.setA(cantcompra);
	              }
	    
	              for(i=0;i<=9;i++){
	               if(z==N[i]){
	                if(cantcompra>M[i][1]){
	                 System.out.println("No tenemos tal cantidad de productos");
	                 System.out.println("  "); 
	                 System.out.println("Ingrese una cantidad menor o igual a "+M[i][1]);
	                 System.out.println("  "); 
	                  i=11;
	 			j=3;           
	                }else{
	                 M[i][1]=M[i][1]-cantcompra;
	                 F[cont]=cantcompra;
	                 G[cont]=P[i];
	                 tcompra=M[1][0]*cantcompra;
	                 System.out.println("Han comprado "+cantcompra + " Unidades de "+P[i]);
	                 System.out.println("  ");
	                 C[cont]=z;
	                 D[cont]=P[i];
	                 E[cont]=tcompra;
	                 aux=cont;
	                 cont=cont+1;
	                 ho.setB(P[i]);
	                 

	                }
	               }
	              } 
	           System.out.println(" Ingrese cualquier letra para salir ");
	           x=s.next();   
	          }while(z==20);
	           System.out.println(" Has salido "); 
	           System.out.println("  ");
	       break;
	       }
	       case 2:{
	         do{
	          System.out.println("Ingrese el codigo del articulo.");
	           while(!s.hasNextInt()){
	           s.next();
	           System.out.println("Seleccione una opcion valida. Por favor");
	           }
	          z=s.nextInt();
	         }while(z == N[0] && z == N[1] && z == N[2] && z == N[3] && z == N[4] && z == N[5] && z == N[6] && z == N[7] && z == N[8] && z == N[9]);
	           if(z != 00 && z!=01 && z != 02 && z != 03 && z != 04 && z != 05 && z != 06 && z != 07 && z != 10 && z != 11){
		      System.out.println("ERROR. Debe ingresar un codigo valido");
		     }else{
	            System.out.println("Ingrese cuantos productos quiere agregar");
	               while(!s.hasNextInt()){
	               s.next();
	               System.out.println("Seleccione una opcion valida. Por favor");
	               }
	             cant=s.nextInt();
	           }
	           for(i=0;i<=9;i++){ 
	            if(z==N[i]){
	             M[i][1]=M[i][1]+cant;
	             System.out.println("Ha Ingresado "+cant + " Unidades de "+P[i]);
	             System.out.println("  "); 
	            }
	           }
	           System.out.println(" Ingrese cualquier letra para salir ");
	           x=s.next();   
	           System.out.println(" Has salido del Informe "); 
	           System.out.println("  ");
	       break;
	       }
	       case 3:{
	        do{ 
	         System.out.println("  "); 
	         System.out.println("Informe de Stock"); 
	         System.out.println("       " + "|CODIGO| DESCRIPCION |STOCK |");
	          for(i=0;i<=9;i++){
	           System.out.println("\t"+N[i] + "\t"+P[i] + "\t "+M[i][1]);
	           System.out.println("  "); 
	          }
	           System.out.println(" Ingrese cualquier letra para salir ");
	           x=s.next();    
	        }while(z==20);
	           System.out.println(" Has salido del Informe "); 
	           System.out.println("  ");
	       break;
	       }
	       case 4:{
	        System.out.println("  "); 
	        System.out.println("Informe de Ventas");
	          for(i=0;i<=aux;i++){
	           System.out.println("       " + "|CODIGO| DESCRIPCION |MONTO VENDIDO  $ |");
	           System.out.println("\t"+C[i] + "\t"+D[i] + "\t  $"+E[i]);
	          }
	           System.out.println(" Ingrese cualquier letra para salir ");
	           x=s.next();
	           System.out.println(" Has salido del Informe "); 
	           System.out.println("  ");
	       break;
	       }
	       case 5:{
	        System.out.println("  "); 
	        System.out.println("Consulta de Precio");
	        do{
	         System.out.println("Ingrese el codigo del articulo.");
	           while(!s.hasNextInt()){
	           s.next();
	           System.out.println("Seleccione una opcion valida. Por favor");
	           }
	         z=s.nextInt();
	        }while(z == N[0] && z == N[1] && z == N[2] && z == N[3] && z == N[4] && z == N[5] && z == N[6] && z == N[7] && z == N[8] && z == N[9]);
	          if(z != 00 && z!=01 && z != 02 && z != 03 && z != 04 && z != 05 && z != 06 && z != 07 && z != 10 && z != 11){
		     System.out.println("El codigo no es valido, ingreselo nuevamente");
		    }
	          for(i=0;i<=9;i++){
	            if(z==N[i]){
	             System.out.println("El precio del producto "+N[i] + "  " +P[i] + " es de: $"+M[i][0]);
	             System.out.println("  ");  
	            }
	          }
	           System.out.println(" Ingrese cualquier letra para salir ");
	           x=s.next();
	           System.out.println(" Has salido de la consulta "); 
	           System.out.println("  ");   
	       break;
	       }
	       case 6:{
	        System.out.println("  "); 
	        System.out.println("Consulta de Stock");
	        do{
	         System.out.println("Ingrese el codigo del articulo.");
	           while(!s.hasNextInt()){
	           s.next();
	           System.out.println("Seleccione una opcion valida. Por favor");
	           }
	         z=s.nextInt();
	        }while(z == N[0] && z == N[1] && z == N[2] && z == N[3] && z == N[4] && z == N[5] && z == N[6] && z == N[7] && z == N[8] && z == N[9]);
	          if(z != 00 && z!=01 && z != 02 && z != 03 && z != 04 && z != 05 && z != 06 && z != 07 && z != 10 && z != 11){
		     System.out.println("El codigo no es valido, ingreselo nuevamente");
		    }
	          for(i=0;i<=9;i++){
	            if(z==N[i]){
	             System.out.println("La cantidad del producto "+N[i] + "  " +P[i] + " es de: "+M[i][1]);
	             System.out.println("  ");  
	            }
	          }
	           System.out.println(" Ingrese cualquier letra para salir ");
	           x=s.next();   
	           System.out.println(" Has salido de la consulta "); 
	           System.out.println("  ");   
	       break;
	       }
	       case 7:{

	        do{
	            System.out.println("Introduce el ID de la persona. Este ID "
	                    + "debe ser mayor que cero: ");
	            idPersona=s.nextLine();
	            
	            try {
	                id=Integer.parseInt(idPersona);
	            } catch (NumberFormatException e) {
	                System.out.println("Debes introducir un ID mayor que cero");
	            }
	        }while(idPersona.isEmpty() || id<=0);
	        
	        
	        do{
	            System.out.println("Introduce el nombre de la persona: ");
	            nombrePersona=s.nextLine();
	        }while(nombrePersona.isEmpty() || nombrePersona.length()>20);
	        
	        do{
	            System.out.println("Introduce un apellido de la persona: ");
	            apellidoPersona=s.nextLine();
	        }while(apellidoPersona.isEmpty() || apellidoPersona.length()>20);
	        
	        do{
	            System.out.println("Introduce la edad de la persona: ");
	            edadPersona=s.nextLine();
	            try {
	                edadEntera=Integer.parseInt(edadPersona);
	            } catch (NumberFormatException e) {
	                System.out.println("Debes introducir un nÃºmero entero");
	            }
	        }while(edadPersona.isEmpty() || edadEntera<=0);
	        
	        do{
	            System.out.println("Introduce el sexo de la persona. 'M' para "
	                    + "masculino o 'F' para femenino. (Sin las comillas): ");
	            sexoPersona=s.next().charAt(0);
	        }while(sexoPersona !='M' && sexoPersona !='F');
	        ho.setId(id);
	        ho.setNombre(nombrePersona);
	        ho.setApellidos(apellidoPersona);
	        ho.setEdad(edadEntera);
	        ho.setSexo(sexoPersona);
	       break;
	       }

	     }
	}while(op!=8);
	System.out.println("Has salido del sistema");

	        try {

	            archivo = new RandomAccessFile("./Registrar_personas.txt", "rw");
	            

	            archivo.seek(archivo.length());
	            

	            escribir= new ByteArrayOutputStream();
	            salida = new ObjectOutputStream(escribir);
	            salida.writeObject(ho.toString());
	            
	            salida.close();
	            
	            array = escribir.toByteArray();
	            
	            archivo.write(array);
	            

	            archivo.close();
	        } catch (Exception e) {
	            System.out.println("No se puede escribir en el archivo" 
	            + e.getMessage());
	        }
	    

	        try {
	            
	            archivo = new RandomAccessFile("./Registrar_personas.txt", "r");
	            
	            archivo.seek(0);
	            
	            array = new byte[(int)archivo.length()];
	            
	            archivo.readFully(array);
	            

	            leer = new ByteArrayInputStream(array);
	            entrada = new ObjectInputStream(leer);
	            
	            ho=(Metodos) entrada.readObject();
	            System.out.println(ho);
	            entrada.close();
	            
	            
	        } catch (Exception e) {
	            System.out.println("No se puede leer el archivo" 
	            + e.getMessage());
	        }
	          

	 }catch(Exception ex){
	  System.out.println(ex.getMessage());
	 }

	   }
	}


