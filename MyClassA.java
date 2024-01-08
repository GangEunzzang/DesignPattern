package designPattern.observer;

import java.util.Observable;

public class MyClassA implements Observer {

    Publisher publisher;
    private boolean isPlay;

    public MyClassA(Publisher publisher) {
        this.publisher = publisher;
        publisher.addObserver(this);
    }

    @Override
    public void update(boolean play) {
        this.isPlay = play;
        myActControl();
    }

    public void myActControl() {
        System.out.println("class-A : " + (isPlay ? "동작 시작" : "동작 정지"));
    }


}
