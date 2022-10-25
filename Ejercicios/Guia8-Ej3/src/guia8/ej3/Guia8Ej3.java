package guia8.ej3;

import entidades.Alumno;
import java.util.Scanner;
import servicio.ServicioAlumno;

public class Guia8Ej3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioAlumno sa = new ServicioAlumno();
        Alumno a = new Alumno();
        sa.crearAlumno();
        sa.notaFinal();
        sa.calcularNotaFinal(0);
    }

}
