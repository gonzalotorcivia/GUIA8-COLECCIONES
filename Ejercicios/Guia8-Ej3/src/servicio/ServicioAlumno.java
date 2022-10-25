package servicio;

import entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioAlumno {

    ArrayList <Alumno> ListaAlumno = new ArrayList<>();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    boolean aux = true;

    public void crearAlumno() {

        do {

            System.out.println("Ingrese el nombre del Alumno");
            String nom = leer.next();
            System.out.println("Ingrese las 3 notas del Alumno");
            ArrayList<Integer> notas = new ArrayList<>();
            notas.add(leer.nextInt());
            notas.add(leer.nextInt());
            notas.add(leer.nextInt());
            ListaAlumno.add(new Alumno(nom, notas));
            System.out.println("Desea ingresar otro alumno; S para continuar N para salir");
            String eleccion = leer.next();
            aux = !eleccion.equalsIgnoreCase("n");

        } while (aux == true);
    }

    public void notaFinal() {

        boolean aux = false;

        System.out.println("Ingrese el alumno que desea buscar");

        String nombre = leer.next();

        for (int i = 0; i < ListaAlumno.size(); i++) {

            if (ListaAlumno.get(i).getNombre().equals(nombre)) {

                calcularNotaFinal(i);

            } else {

                aux = true;

            }
            if (aux == true) {

                System.out.println("EL alumno no existe en la lista");

            }

        }
    }

    public void calcularNotaFinal(int aux) {

        System.out.println("La nota final del Alumno " + ListaAlumno.get(aux).getNombre() + " es:");

        System.out.println((ListaAlumno.get(aux).getNotas().get(0) + ListaAlumno.get(aux).getNotas().get(1) + ListaAlumno.get(aux).getNotas().get(2)) / 3);
    }

}
