package utils;

public interface Observable {
    void notify(Observer observer);

    void notifyAllObsesrver(String command, Object source);

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

}
