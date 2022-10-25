package servicio;

import entidades.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioPelicula {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    ArrayList<Pelicula> ListaPelicula = new ArrayList();

    //Pelicula t = new Pelicula();

    public void crearPelicula() {

        String eleccion;

        do {

            System.out.println("Ingrese el nombre de la pelicula");
            String nombrepelicula = leer.next();
            System.out.println("Ingrese el director de la pelicula");
            String director = leer.next();
            System.out.println("Ingrese la duracion de la pelicula en horas");
            Double duracion = leer.nextDouble();

            System.out.println("Desea ingresar otra pelicula, presione s para continuar y n para salir");
            eleccion = leer.next();

            ListaPelicula.add(new Pelicula(nombrepelicula, director, duracion));

        } while (!eleccion.equalsIgnoreCase("n"));

    }

    public void mostrarPelicula() {

        for (Pelicula pelicula : ListaPelicula) {

            System.out.println("LAs pelicula ingresadas son: " + pelicula);

        }
    }

    public void MostrarMayor1hs() {

        for (Pelicula pelicula : ListaPelicula) {
            
            if (pelicula.getDuracion() > 1) {
                
                System.out.println("las peliculas mayores a 1 hs son" + pelicula);

            }
        }
    }

    public void ordenarporTiitulomayormenor() {

        ListaPelicula.sort(Pelicula.OrdenaTitulo);

    }

    public void ordenarporTiitulomenormayor() {

        ListaPelicula.sort(Pelicula.ComparaPeli);

    }

    public void compararporDirector() {

        ListaPelicula.sort(Pelicula.Comparadirector);

    }
}
