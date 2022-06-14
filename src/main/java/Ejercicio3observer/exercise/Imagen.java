package Ejercicio3observer.exercise;

public class Imagen {
    private String nombre;
    private String titulo;
    public Imagen(String titulo) {
        this.titulo = titulo;
        this.nombre = "VIDEO/IMAGEN";
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
