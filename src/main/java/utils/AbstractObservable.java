package utils;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class AbstractObservable implements Observable {

    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void notify(Observer observer) {


    }

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }


    public void notifyAllObsesrver(String command, Object source) {
        this.observers.forEach(observer -> {
            observer.notify(command, source);
        });
    }

    public void notifyAllObsesrver(String command, Map<String, Double> source) {
        this.observers.forEach(observer -> {
            observer.notify(command, source);
        });
    }


}
