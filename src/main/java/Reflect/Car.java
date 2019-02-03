package Reflect;

/**
 * 这个类也写了单元测试。
 */
public class Car implements InterfaceTransport {

    private String name;
    private int speed;

    public Car() {
        this.name = "Init Name";
        this.speed = 0;
    }

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String info() {
        return "Name is " + this.name + ", and speed is " + this.speed + ".";
    }

    private String infoPrivate() {
        return "Private: Name is " + this.name + ", and speed is " + this.speed + ".";
    }
}
