package Ejercicio3observer.exercise;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements IPagina {
    private List<Video> videos = new ArrayList<>();
    private List<Imagen> imagens = new ArrayList<>();
    private List<IUser> observers = new ArrayList<>();
    private String attr1;
    private String attr2;
    private String attr3;

    public ConcreteSubject(){

    }


    @Override
    public void attach(IUser observer) {
        observers.add(observer);
    }

    @Override
    public void detach(IUser observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Video video, Imagen imagen) {
        for (IUser obs:observers) {
            if(obs.getPreferencia().equals(video.getNombre())){
                obs.update("Nuevo Video",video,new Imagen(""));
            }else if (obs.getPreferencia().equals(imagen.getNombre())){
                obs.update("Nuevo Video e Imagen",video,imagen);
            }
        }

    }
}