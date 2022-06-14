package observer.exercise;

public class ConcreteObserver1 implements IUser {
    @Override
    public void update(String msg) {
        // colocamos logica basados en el mensaje recibido
        System.out.println("ConcreteObserver1 tiene una notificacion de un evento");
        System.out.println("MSG: "+msg);

    }
}