public class Car {
    private boolean start;
    private boolean go;
    private int speed;

    public Car() {
        start = false;
        go = false;
        speed = 0;
    }

    //todo add  public static void main() to test this class
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
        //TODO you are assigning true to start var here, I believe you need  if (start == true), or simpler: if (start)
        if (start = true)
            go = true;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        //TODO you are assigning true to go var here, I believe you need  if (go == true), or simpler: if (go)
        if (go = true)
            this.speed = speed;
    }
}