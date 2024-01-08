package designPattern.observer;

import java.util.Observable;

public class MyClassB implements Observer {

    Publisher publisher;
    private boolean isPlay;

    public MyClassB(Publisher publisher) {
        this.publisher = publisher;
        publisher.addObserver(this);
    }

    @Override
    public void update(boolean play) {
        this.isPlay = play;
        myActControl();
    }

    public void myActControl() {
        System.out.println("class-B : " + (isPlay ? "동작 시작" : "동작 정지"));
        publisher.deleteObserver(this);
    }
}
