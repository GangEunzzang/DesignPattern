package designPattern.bridge;

public class RobotModel2 implements IRobot {
    @Override
    public void powerOn() {
        System.out.println("type2 : power On");
    }

    @Override
    public void powerOff() {
        System.out.println("type2 : power Off");
    }

}
