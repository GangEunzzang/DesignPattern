package designPattern.bridge;

public class RobotModel1 implements IRobot {
    @Override
    public void powerOn() {
        System.out.println("type1 : power On");
    }

    @Override
    public void powerOff() {
        System.out.println("type1 : power Off");
    }

}
