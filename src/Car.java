public class Car {
    private boolean start;
    private boolean go;
    private int speed;

    public Car() {
        start = false;
        go = false;
        speed = 0;

    }

    public Car(boolean start, boolean go, int speed) {
        this.start = start;
        this.speed = speed;
        this.go = go;
    }

    public void turnOn() {
        start = true;
    }

    public void turnOff() {
        start = false;
    }

    public void go(boolean start) {
        this.start = start;
        if (start = true)
            go = true;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (go = true)
            this.speed = speed;
    }
}