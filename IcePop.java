package designPattern.decorator;

public class IcePop extends IceCream{

    public IcePop() {
        this.description = "아이스크림 막대";
    }

    @Override
    public int price() {
        return 1000;
    }
}
