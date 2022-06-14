package Ejercicio4strategy.exercise;

import java.util.ArrayList;
import java.util.List;

public class ConcreteStrategy1 implements IStrategy {

    @Override
    public void execute(ArrayList<Libro> libros) {
        System.out.println("ORDENANDO POR ID");
        int i, j, menor, posi, tmp;
        String nt;
        String ci;
        for( i = 0; i< libros.size()- 1;i++){
            menor = libros.get(i).getId();
            posi = i;
            for (j = i+1; j<libros.size();j++){
                if (libros.get(j).getId()< menor){
                    menor= libros.get(j).getId();
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
            System.out.println("Libro: "+l.getTitulo()+" ID: "+l.getId());
        }
    }
}