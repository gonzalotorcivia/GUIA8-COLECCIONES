package guia8.ej2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Guia8Ej2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ArrayList<String> razaperros = new ArrayList(); //creo la lista

        boolean aux = true;

        do {
            System.out.println("Ingrese una raza de perro");

            razaperros.add(leer.next()); //guardo la raza en la lista

            System.out.println("Desea agregar otra raza de perro, pulse S para continuar o N para salir");

            String s = leer.next();

            aux = !s.equalsIgnoreCase("n");

        } while (aux == true);

        razaperros.forEach((index) -> {
            System.out.println("Las razas ingresadas son : " + index + " ");
        });

        System.out.println("-------------------------------------------------");
        // for (String razaperro : razaperros) { //muestro las razas guardadas
        //    System.out.println(razaperro);
        System.out.println("Ingrese una raza que desee eliminar");

        String razaeliminar = leer.next();

        Iterator<String> it = razaperros.iterator();

        boolean aux1 = false;

        while (it.hasNext()) {

            if (it.next().equals(razaeliminar)) {

                it.remove();

            } else {

                aux1 = true;

            }

            System.out.println("----------------------");

        }

        Collections.sort(razaperros);

        if (aux == false) {

            System.out.println("La raza ingresada es incorrecta");
        }
        razaperros.forEach((index) -> {

            System.out.println("La lista quedo de la siguiente manera: " + index + " ");
        });
    }

}
