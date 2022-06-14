package Ejercicio3observer.exercise;

public class ConcreteUser implements IUser {
    String preferencia;
    Persona persona;

    public ConcreteUser(String preferencia, Persona persona) {
        this.preferencia = preferencia;
        this.persona = persona;
    }

    @Override
    public void update(String msg, Video video, Imagen imagen) {
        System.out.println("--------------------------Notificacion------------------------------");
        System.out.println("Video: "+video.getTitulo());
        if (imagen.getNombre()=="VIDEO/IMAGEN"&&imagen.getTitulo()!=""){
            System.out.println("Imagen: "+imagen.getTitulo());
        }

    }

    @Override
    public String getPreferencia() {
        return preferencia;
    }

    public Persona getPersona(){
        return persona;
    }
}