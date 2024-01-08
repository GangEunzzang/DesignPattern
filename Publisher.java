package designPattern.observer;

public interface Publisher {

    void addObserver(Observer o);

    void deleteObserver(Observer o);

    void notifyObservers();
}
