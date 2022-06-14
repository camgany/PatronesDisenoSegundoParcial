package Ejercicio5state.practice;

public class ConcreteApagado implements IState {
    // attribute
    // methods


    @Override
    public void handle(Celular context) {
        context.setProgramaAbierto(new String[0]);
        context.getComsumoCPU().setConsumo(10);
        context.getConsumoMemoria().setConsumo(10);
        System.out.println("----------------ESTADO APAGADO-------------------");
        System.out.println("Consumo CPU: "+context.getComsumoCPU().getConsumo());
        System.out.println("Consumo Memoria RAM: "+context.getConsumoMemoria().getConsumo());
        System.out.println("Cantidad de Programas: "+context.getProgramaAbierto().length);
    }
}