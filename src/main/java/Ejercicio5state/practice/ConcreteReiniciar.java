package Ejercicio5state.practice;

public class ConcreteReiniciar implements IState {
    // attribute
    // methods


    @Override
    public void handle(Celular context) {
        System.out.println("-------------------------REINICIANDO--------------------------");
        System.out.println("Cerrando los programas..................");
        context.getConsumoMemoria().setConsumo(0);
        System.out.print("Consumo de Memoria RAM: " +context.getConsumoMemoria().getConsumo()+" ");
        context.getComsumoCPU().setConsumo(0);
        System.out.println("Consumo de CPU: " +context.getComsumoCPU().getConsumo());

    }
}