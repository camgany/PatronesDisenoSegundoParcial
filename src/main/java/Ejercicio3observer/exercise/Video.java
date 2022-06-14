package Ejercicio3observer.exercise;

public class Video {
    private String nombre;
    private String titulo;


    public Video(String titulo) {
        this.titulo = titulo;
        this.nombre = "VIDEO";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNombre() {
        return nombre;
    }
}
