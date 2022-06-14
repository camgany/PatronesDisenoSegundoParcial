package Ejercicio4strategy.exercise;

import java.util.ArrayList;
import java.util.List;

public class ConcreteStrategy1 implements IStrategy {

    @Override
    public void execute(ArrayList<Libro> libros) {
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
                nt
            }
        }
    }
}