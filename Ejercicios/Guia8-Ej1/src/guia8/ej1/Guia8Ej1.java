package guia8.ej1;

import java.util.ArrayList;
import java.util.Scanner;

public class Guia8Ej1 {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ArrayList <String> razaperros = new ArrayList(); //creo la lista
        
        boolean aux=true;
        
        do {        
            System.out.println("Ingrese una raza de perro");
           
            razaperros.add(leer.next()); //guardo la raza en la lista
            
            System.out.println("Desea agregar otra raza de perro, pulse S para continuar o N para salir");
            
            String s = leer.next();
            
            aux = !s.equalsIgnoreCase("n");
            
        } while (aux==true);
       
        for (String razaperro : razaperros) { //muestro las razas guardadas
            
            System.out.println(razaperro);
        }
        
            
        
    }
    
}
