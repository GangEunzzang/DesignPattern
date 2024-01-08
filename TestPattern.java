package designPattern.observer;

public class TestPattern {

    public static void main(String[] args) {
        PlayController controller = new PlayController();
        MyClassA classA = new MyClassA(controller);
        MyClassB classB = new MyClassB(controller);

        System.out.println(" 클래스 일시 정지 ");
        controller.setPlay(false);

        System.out.println();

        System.out.println(" 클래스 시작 ");
        controller.setPlay(true);

    }
}
