package designPattern.adapter;

public class BPlayerImpl implements BPlayer{

    @Override
    public void playFile(String fileName) {
        System.out.println("B " + fileName);
    }

    @Override
    public void stopFile() {

    }
}
