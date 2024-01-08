package designPattern.bridge;

import java.sql.SQLOutput;

public class TestPattern {

    public static void main(String[] args) {
        IAction action = new IAction(new RobotModel1());
        action.powerOn();
        action.cook();
        action.laundry();
        action.powerOff();

        action = new IAction(new RobotModel2());
        action.powerOn();
        action.cook();
        action.laundry();
        action.powerOff();

    }
}
