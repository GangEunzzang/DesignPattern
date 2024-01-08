package designPattern.bridge;

public class IAction {
    private IRobot robot;

    public IAction(IRobot robot) {
        this.robot = robot;
    }

    void powerOn() {
        robot.powerOn();
    }

    void powerOff() {
        robot.powerOff();
    }

    void cook() {
        System.out.println("요리 시작 !!");
    }

    void laundry() {
        System.out.println("빨래 시작 !!");
    }
}
