package Ejercicio4strategy.exercise;

public class Client {
    public static void main (String[]args){
        Context context = new Context("BD");
        context.addLibro(new Libro(3434,"El principito","Infantil"));
        context.addLibro(new Libro(1222,"Crepusculo","Juvenil"));
        context.addLibro(new Libro(7655,"La Biblia","Religioso"));
        context.setStrategy(new ConcreteStrategy2());
        context.execute();
        context.setStrategy(new ConcreteStrategy1());
        context.execute();
        context.setStrategy(new ConcreteStrategy3());
        context.execute();
    }

}