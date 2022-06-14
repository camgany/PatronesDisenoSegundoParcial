package Ejercicio4strategy.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ConcreteStrategy2 implements IStrategy {

    @Override
    public void execute(ArrayList<Libro> libros) {
        for (int i = 0; i < libros.size(); i++
             ) {
            Collections.sort(libros.get(i).getTitulo());
        }

    }
}