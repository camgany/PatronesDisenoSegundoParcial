package Ejercicio3observer.exercise;

public class Client {
    public static void main (String [] args){
        ConcreteSubject subject = new ConcreteSubject();
        Persona persona = new Persona();
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();

        subject.attach(new ConcreteUser("VIDEO", persona));
        subject.attach(new ConcreteUser("VIDEO/IMAGEN", persona1));
        subject.attach(new ConcreteUser("VIDEO/IMAGEN", persona2));

        subject.notifyObservers(new Video("Video 1"),new Imagen("Imagen 1"));
        subject.notifyObservers(new Video("Video 2"),new Imagen("Imagen 2"));
        subject.notifyObservers(new Video("Video 3"),new Imagen("Imagen 3"));

    }
}