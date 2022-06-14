package Ejercicio5state.practice;

import java.util.Random;

public class ConcretePrendido implements IState {
    // attribute
    // methods

    @Override
    public void handle(Celular context) {
        int a;
        a = new Random().nextInt(20);
        String[] b = new String[a];
        System.out.println("-------------------------PRENDIDO--------------------------");
        //System.out.println(a);
        for(int i = 0; i < a; i++){
            b [i]= "Google Chrome";
        }
        context.setProgramaAbierto(b);
        for(int i = 0; i< a; i++){
            System.out.println("Recurso: "+b[i]);
        }
        System.out.println("Cantidad de recursos abiertos: "+context.getProgramaAbierto().length);
        context.getConsumoMemoria().setConsumo(a*5);
        System.out.print("Consumo de Memoria RAM: " +context.getConsumoMemoria().getConsumo());
        context.getComsumoCPU().setConsumo(a*5);
        System.out.println("Consumo de CPU: " +context.getComsumoCPU().getConsumo());

    }
}