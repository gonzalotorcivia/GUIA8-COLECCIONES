package entidades;

import java.util.Comparator;

public class Pelicula {

    private String titulo;
    private String director;
    private Double duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + '}';
    }

    public static Comparator <Pelicula> OrdenaTitulo = new Comparator<Pelicula>() {

        @Override
        public int compare(Pelicula objeto1, Pelicula objeto2) {
            
            return objeto1.getTitulo().compareTo(objeto2.getTitulo());

        }

        public void ordenaTitulo() {

        }

    };

     //de menor a mayor
     public static Comparator<Pelicula> ComparaPeli= new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula objeto1, Pelicula objeto2){
        return objeto2.getDuracion().compareTo(objeto1.getDuracion());
               
        } 
        
    };
     public static Comparator<Pelicula> Comparadirector= new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula objeto1, Pelicula objeto2){
        return objeto1.getDirector().compareTo(objeto2.getDirector());
               
        } 
        
    };

}
