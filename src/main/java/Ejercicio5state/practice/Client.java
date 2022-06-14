package Ejercicio5state.practice;


public class Client {

    public static void main (String[]args){
        Celular context = new Celular();
        context.setState(new ConcreteApagado());
        context.request();
        context.setState(new ConcretePrendido());
        context.request();
        context.setState(new ConcreteReiniciar());
        context.request();
        context.setState(new ConcreteApagado());
        context.request();

    }
}
