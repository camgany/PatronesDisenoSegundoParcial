package Ejercicio4strategy.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ConcreteStrategy2 implements IStrategy {

    @Override
    public void execute(ArrayList<Libro> libros) {
        System.out.println("ORDENANDO POR TITULO");
        int i, j, menor, posi, tmp;
        String nt;
        String ci;
        for( i = 0; i< libros.size()- 1;i++){
            menor = libros.get(i).getTitulo().charAt(0);
            posi = i;
            for (j = i+1; j<libros.size();j++){
                if (libros.get(j).getTitulo().charAt(0)< menor){
                    menor= libros.get(j).getTitulo().charAt(0);
                    posi = j;
                }
            }
            if(posi != i){
                tmp = libros.get(i).getId();
                libros.get(i).setId(libros.get(posi).getId());
                libros.get(posi).setId(tmp);
                nt = libros.get(i).getTitulo();
                libros.get(i).setTitulo(libros.get(posi).getTitulo());
                libros.get(posi).setTitulo(nt);
                ci = libros.get(i).getCategoria();
                libros.get(i).setCategoria(libros.get(posi).getCategoria());
                libros.get(posi).setCategoria(ci);
            }
        }
        for (Libro l : libros
        ) {
            System.out.println("Libro: "+l.getTitulo());
        }

    }
}