package designPattern.decorator;

public abstract class IceCream {
    protected String description = "";

    public String getDescription() {
        return description;
    }

    public abstract int price();
}
