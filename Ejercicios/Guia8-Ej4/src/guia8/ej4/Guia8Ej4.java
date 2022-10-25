package guia8.ej4;

import servicio.ServicioPelicula;

public class Guia8Ej4 {

   
    public static void main(String[] args) {

        ServicioPelicula sp = new ServicioPelicula();
        
        sp.crearPelicula();
        sp.mostrarPelicula();
        sp.MostrarMayor1hs();
        sp.ordenarporTiitulomayormenor();
        sp.ordenarporTiitulomenormayor();
        sp.compararporDirector();
        
        
        
        
        
    }
    
}
