package Ejercicio4strategy.exercise;

import java.util.ArrayList;
import java.util.List;

public interface IStrategy {
    void execute(ArrayList<Libro> libros);
}