package observer.exercise;

public interface IPagina {
    void attach(IUser observer);//agregar/adjuntar a los observadores
    void detach(IUser observer);//eliminar a los observadores
    void notifyObservers(Video video, Imagen imagen);
}