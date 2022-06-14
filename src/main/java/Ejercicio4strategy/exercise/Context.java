package Ejercicio4strategy.exercise;

import java.util.ArrayList;
import java.util.List;

public class Context {
    ArrayList<Libro> libros = new ArrayList<>();
    IStrategy strategy;
    String nombre;

    public Context(String nombre) {
        this.nombre = nombre;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public  void addLibro(Libro libro){
        libros.add(libro);
    }

    public IStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }


    public void execute(){
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("----------------------------Base de datos "+nombre+"----------------------------");
        strategy.execute(libros);
    }


}
