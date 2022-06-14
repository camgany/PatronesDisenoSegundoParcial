package observer.exercise;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements IPagina {

    private List<IUser> observers = new ArrayList<>();
    private String attr1;
    private String attr2;
    private String attr3;

    public ConcreteSubject(){

    }

    public void action1(){
        System.out.println("Promocion > action1");
        this.notifyObservers("action1 utilizada");
    }

    public void action2(){
        System.out.println("Promocion > action2");
        this.notifyObservers("action2 utilizada");
    }

    public String getAttr1() {
        return attr1;
    }

    public void setAttr1(String attr1) {
        this.attr1 = attr1;
    }

    public String getAttr2() {
        return attr2;
    }

    public void setAttr2(String attr2) {
        this.attr2 = attr2;
    }

    public String getAttr3() {
        return attr3;
    }

    public void setAttr3(String attr3) {
        this.attr3 = attr3;
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
    public void notifyObservers(String msg) {
        for (IUser obs:observers) {
            obs.update(   "INFO> Evento "+msg  );
        }

    }
}