package designPattern.observer;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Observable;

public class PlayController implements Publisher {
    public List<Observer> observers = new ArrayList<>();
    private boolean isPlay; // 실행여부
    public PlayController(){}

    public void setPlay(boolean play) {
        isPlay = play;
        notifyObservers();
    }

    public boolean isPlay() {
        return isPlay;
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void deleteObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(isPlay);
        }
    }
}
